import java.util.Scanner;

public class hmwGreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st number");
        int number1 = scanner.nextInt();
        System.out.println("Please input 2nd number");
        int number2 = scanner.nextInt();
        System.out.println("Please input 3rd number");
        int number3 = scanner.nextInt();

        System.out.println(Math.max(Math.max(number1, number2), number3));

        //find out the greatest value
        if (number1 > number2 && number1> number3) {
            System.out.println("The greatest: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The greatest: " + number2);
        } else if (number3 > number1 && number3> number2) {
            System.out.println("The greatest: " + number3);
        } else {
            System.out.println("Please input not equal numbers if you want to find the greatest value!");
        }
        }
    }



