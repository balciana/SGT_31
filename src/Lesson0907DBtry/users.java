package Lesson0907DBtry;

import java.sql.*;
import java.util.Scanner;

public class users {
    public static void main(String[] args) {

        //connecting to database
        //create few variables which connects with database
        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "karaliene123!";

        Scanner scanner = new Scanner(System.in);
        //creating while loop for repeating entries
        char again = 'y';


        //in brackets after try make connection
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
            System.out.println("Connected to database");

//            readData(conn);
//            call insert method conn, and values
//            insertData(conn, "ana", "ana123","ana bal", "ana@gmail.com");

            //while loop
            while(again == 'y'){
                System.out.println("Choose one option (r, i, d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");
                //read char form users one by one
                char action = scanner.nextLine().charAt(0);

                if (action == 'i'){


                    System.out.println("Enter username");
                    //store in variable
                    //read from the users
                    String newUsername = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter email");
                    String newEmail = scanner.nextLine();

                    //call method for inserting data
                    insertData(conn, newUsername, newPassword, newFullName, newEmail);


                    //reading data
                }else if(action == 'r'){
                    readData(conn);

                }else if(action == 'd'){
                    System.out.println("Enter username that you want to delete");
                    String deleteUser = scanner.nextLine();
                    deleteData(conn, deleteUser);
                }
                //do you want to do smth more
                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);


            }

        }catch(Exception e){
            //more information about problem
            e.printStackTrace();

        }


    }

    //reading data
    //connection conn connects where data is
    //we can use try method for exception handling or use another method - throws
    public static void readData(Connection conn) throws SQLException {
        //nuskaitom data is users table
        String sql = "SELECT * FROM users";
        //statement kai reikia nuskaityti data
        Statement statement = conn.createStatement();
        //get results and fields in which we are interested in
        ResultSet resultSet = statement.executeQuery(sql);

        //create variable for example users id count
        int count = 0;
        //while for iterating through all results
        //different way to
        while(resultSet.next()){
            //create variables for what we want to read
            //username column 2 so pass this value to brackets
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            //different approach in brackets to find a column - pass the name of the column
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            //output look like - like printf statement, choose #
            String output = "User #%d: %s - %s - %s - %s";
            //like printf format
            //increase count
            //++count first increment 0 to 1, when printed
            //passing values after commas
            System.out.println(String.format(output, ++count, username, password, fullName, email));
            //call readData method in main
        }

    }
    //inserting data
    //in brackets pass inputs: connection input and inputs string username...
    public static void insertData (Connection conn, String username, String password, String fullName, String email) throws SQLException {
        //prepared method when we need manipulate data
        //1 create sql query
        //in brackets we write values which we want to pass
        //id is autoincrement
        //? HOW MANY VALUES AND WE WILL REPLACE IT WITH VALUES
        String sql = "INSERT INTO users (username, password, fullname, email) VALUE (?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        //replace question marks
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, fullName);
        statement.setString(4, email);

        //execute the insert part
//        statement.executeUpdate();
        //call insert method in main method insertData(conn, values in brackets)
        //to see if everything was successfully

        int rowsInserted = statement.executeUpdate();
        //if inputs were successfully inserted
        if (rowsInserted > 0){
            System.out.println("A new user was inserted successfully");
        } else{
            System.out.println("Something was wrong");
        }

    }


    //deletion of the data
    public static void deleteData(Connection conn, String username) throws SQLException {
        String sql = "DELETE FROM users WHERE username = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);

        //execute
        int rowsDeleted = statement.executeUpdate();
        //if inputs were successfully inserted
        if (rowsDeleted > 0){
            System.out.println("A new user was deleted successfully");
        } else{
            System.out.println("Something was wrong");
        }



    }
}
