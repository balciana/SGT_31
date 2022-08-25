package Lesson0810_Methods;

import java.util.Scanner;

public class HmwMethodsLeapYear {
    public static void main(String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        year = scanner.nextInt();

        determinLeapYear(year);

    }

    public static void determinLeapYear(int year){
        if((year%4==0 && year % 100 !=0)||(year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }

    }
}
