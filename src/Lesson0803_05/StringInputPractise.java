package Lesson0803_05;

import java.util.Scanner;

public class StringInputPractise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name Name and Age (John 30)");

        //declare
        //1 read string from user and get rid of space (trim)
        //2 get substring of last two characters in the string
        //3 Convert those to integer
        //4 if age is over 70 the print "Senior" if not then print "Adult"

        //1
        String nameAge = scanner.nextLine().trim();
        //System.out.println(nameAge);

        //2

        System.out.println(nameAge.substring(nameAge.length()-2));
        //3
        //mano sprendimas
        String lastElements = nameAge.substring(nameAge.length()-2);
        int age = Integer.parseInt(lastElements);
        System.out.println(Integer.parseInt(lastElements));

        //4
        //mokytojo sprendimas
        if(Integer.parseInt(nameAge.substring(nameAge.length()-2)) >= 70){
            System.out.println("Senior");

        } else {
            System.out.println("Adult");

        }

        //mano sprendimas
        if (age > 70){
            System.out.println("Senior");
        } else{
            System.out.println("Adult");

        }









    }
}
