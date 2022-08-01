package homework;

import java.util.Scanner;

public class ChristmasTreeTeachers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter rows number");
        int size = scanner.nextInt();

        //level
        for (int i =0; i <size; i++){
            //spaces
            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j < i*2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom level
        for (int i = 0; i < size - 1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
