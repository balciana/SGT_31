package Lesson0808;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HmwPersonalNoRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your personal number");
            String input = scanner.nextLine().trim();

            Pattern pattern = Pattern.compile("[123]{6}-[0-9]{5}");
            Matcher matcher = pattern.matcher(input);
            boolean correctInput = matcher.matches();

            if (correctInput) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }

            System.out.println("Do you want to check your personal number again?y/n");
            String inputYesNo = scanner.nextLine().trim().toLowerCase();
            if (inputYesNo.equals("n")) {
                break;
            }


        }
    }

}
