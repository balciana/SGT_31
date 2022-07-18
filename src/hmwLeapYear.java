import java.util.Scanner;

public class hmwLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("Please enter positive value");
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }

    }





