package Lesson0803_05;

import java.util.Scanner;

public class HmwPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Palindrome word");

        String input = scanner.nextLine().trim().toLowerCase();
        System.out.println(input);

        String reverseInput = "";

        int inputLength = input.length();
        for (int i = (inputLength -1); i >= 0; i--){
            reverseInput = reverseInput + input.charAt(i);
        }

        if (input.equals(reverseInput)){
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }


    }
}
