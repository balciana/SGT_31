package Lesson0810_Methods;

import java.util.Scanner;

public class ExrMethodsLeapYear {
    public static void main(String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        year = scanner.nextInt();

        determinLeapYear(year);

        //papildoma uzduotis atspausdinti String
        String result = determinLeapYearString(1853);
        System.out.println(result);
    }

    public static void determinLeapYear(int year){
        if((year%4==0 && year % 100 !=0)||(year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }

    //additional task: modify method so it has return type of String and return answer in text: 2004 is a leap year!
    public static String determinLeapYearString(int year){
        if((year%4==0 && year % 100 !=0)||(year % 400 == 0)){
           return year + " Leap year";
        }else{
            return year + " Not a leap year";
        }

        }
    }

