package homework;

import java.util.Scanner;

public class HomeworkLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int input = scanner.nextInt();

        if (input >= 0){
            for (int i = input; i >= 0; i--){
                System.out.print(i + " ");
            }
        } else {
            for(int i = input; i <= 0; i++){
                System.out.println(i + " ");
            }

        }




//        while (input < 0) ;
//        System.out.print(input + " ");
//        input--;
//        }

//        while (input > 0) {
//        System.out.print(input + " ");
//        input++;
//        }
//        if (input == 0) {
//            System.out.println(input);
//
//      }




    }

    public static class Try {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter rows number");
            int size = scanner.nextInt();

            for (int i = 0; i < size; i++){


                for (int j = 0; j< size -1 - i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < i*2 + 1; j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }

            }
        }
}


