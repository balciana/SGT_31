package Lesson0803_05;

import java.util.Scanner;

public class HmwPalindromeTeachersAnswer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Palindrome word");

        String input = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");
        boolean isPalindrome = true;

        for (int i = 0; i < input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome){
            System.out.printf("Your input %s is palindrome \n", input);
        } else {
            System.out.printf("Your input %s is not a palindrome \n", input);
        }
    }
}
