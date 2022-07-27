package homework;

import java.util.Scanner;

public class HmwArrays {
    public static void main(String[] args) {


        System.out.println("Please enter required size of the array(positive number)");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int myArray[] = new int [size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter element number: " + (i + 1));
//            int input = scanner.nextInt(); longer way
//            myArray[i] = input;

            //shorter way how to get an input
            myArray[i] = scanner.nextInt();
        }
            //print out the output
            System.out.println("Source Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(myArray[i] + " ");
            }

        System.out.println();

        //Printing out all array's elements using For-each
        System.out.println("Source Array: ");
        for(int temp : myArray){
            System.out.print(temp + " ");
        }
        }



    }

