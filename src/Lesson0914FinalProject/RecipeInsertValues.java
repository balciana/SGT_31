package Lesson0914FinalProject;

import java.sql.*;
import java.util.Scanner;



public class RecipeInsertValues {

    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Connected to database");

            while (again == 'y') {
                System.out.println("What do you want to do? (r,t,n,s)");
                System.out.println("r - find the recipe by random choice");
                System.out.println("t - find a random recipe fallowing by season");
                System.out.println("n - add a new recipe");
                System.out.println("s - stop the program");
                char choice = scanner.nextLine().charAt(0);

                //other method for question
                if ( choice == 'n') {
                    //smaller while loop for question
                    String RecipeName = "";
                    while (RecipeName.length() < 3) {
                        System.out.println("Enter Recipe name with more or equals to 3 characters: ");//at least 3 symbols
                        RecipeName = scanner.nextLine();
                    }

                    System.out.println("Please enter a season/seasons - winter, spring, summer, autumn -  for the dish. You can add one or more seasons!");
                    String season = scanner.nextLine().trim().toLowerCase();
                    boolean winter = false;
                    boolean spring = false;
                    boolean summer = false;
                    boolean autumn = false;

                    if (season.contains("winter")) {
                        winter = true;
                    }
                    if (season.contains("spring")) {
                        spring = true;
                    }
                    if (season.contains("summer")) {
                        summer = true;
                    }
                    if (season.contains("autumn")) {
                        autumn = true;
                    }

//                    System.out.println("Winter " + winter);
//                    System.out.println(("Spring " + spring));
//                    System.out.println("Summer " + summer);
//                    System.out.println("Autumn " + autumn);


                    System.out.println("Enter ingredients, for example: flour, milk, chicken, etc.");
                    String Ingredients = scanner.nextLine();

                    //ask hours and minutes, variable time, put together
                    //limitation 0-59
                    //minutes in while loop
                    //reg expression
                    //2 variables to put in one and then send to database
                    System.out.println("Enter cooking hours");
                    int hours = scanner.nextInt();
                    int min;
                    do {
                        System.out.println("Enter cooking minutes");
                        min = scanner.nextInt();
                    } while (min > 60);

                    String CookingTime = Integer.toString(hours) + " hr " + Integer.toString(min) + " mins ";

                    //doubles line?
                    String Instructions = "";
                    do {
                        System.out.println("Enter a valid link for instructions (starting from https://)");
                        Instructions = scanner.nextLine();
                    }
                    while (!Instructions.contains("https"));


                    insertData (conn, RecipeName, winter, spring, summer, autumn, Ingredients, CookingTime, Instructions);

                }else{
                    System.out.println("Other choice chosen");
                }
                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);

            }

            }catch(Exception e){
            e.printStackTrace();

    }
        }

    private static void insertData(Connection conn, String RecipeName, boolean winter, boolean spring, boolean summer, boolean autumn, String Ingredients, String CookingTime, String Instructions) throws SQLException {

        String sql = "INSERT INTO recipes (RecipeName, winter, spring, summer, autumn, Ingredients, CookingTime, Instructions) VALUE (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        //replace question marks
        statement.setString(1, RecipeName);
        statement.setString(2, String.valueOf(winter));
        statement.setString(3, String.valueOf(spring));
        statement.setString(4, String.valueOf(summer));
        statement.setString(5, String.valueOf(autumn));
        statement.setString(6, Ingredients);
        statement.setString(7, CookingTime);
        statement.setString(8, Instructions);



        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0){
            System.out.println("A new recipe was inserted successfully");
        } else{
            System.out.println("Something was wrong");
        }

    }
}
