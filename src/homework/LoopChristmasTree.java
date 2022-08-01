package homework;

import java.util.Scanner;

//Write an application, that will draw Christmas tree according to example below.
//The height of tree should be read from user (positive integer). Use scanner to as user for tree size
public class LoopChristmasTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter rows number");
        int rows = scanner.nextInt();
        int space, stars, i;

        //each level
        for (i = 1; i <= rows; i++) {
            //spaces
            for (space = 1; space <= rows - i; space++) {

                System.out.print(" ");
            }
            //stars
            for (stars = 1; stars <= i * 2 - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

            for (space = 1; space <= rows - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }





