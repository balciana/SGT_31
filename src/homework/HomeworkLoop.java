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
}


