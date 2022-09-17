package Lesson0907DBtry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDBConnectionT {
    public static  void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection class object
            //link to database java31
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "karaliene123!");
            Statement stmt = con.createStatement();
            //execute query sql code in brackets
            //we want to get info about users table
            ResultSet rs = stmt.executeQuery("SELECT * from users");

            //collect results
            //repeat itself and read one by ine each record
            while(rs.next()){
                //get individually values
                //need to now data variables type: int, varchar - %d, %s
                //rs.method based on data type, in brackets - column number
                System.out.printf("ID %d username: %s password: %s full name: %s email: %s\n",
                        rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

            }
            //close connection to database
            con.close();




        }catch (Exception e){
            System.out.println(e);

        }
    }
}
