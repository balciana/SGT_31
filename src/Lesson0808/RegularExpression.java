package Lesson0808;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //create a pattern
        //+ - a one or more, 1b, 1c, 1d
        Pattern pattern = Pattern.compile("a+bcd");
        //matcher will take pattern and check whole string
        Matcher matcher = pattern.matcher("raabcd");
        //matches check if whole string is in the pattern
        System.out.println(matcher.matches());

        //we can find some of the parts follows regular expression
        System.out.println(matcher.find());

        //galime patikrinti matches viena eilute
        //any lowercase letter or any number from 5 to 9, accept 3 (quantifier) values/symbols
        System.out.println(Pattern.matches("[a-z5-9]{3}","423"));

        //Example HP-5742
        //        PO-6235
        //        FR-23
        //        KC-2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's plate number");
        String plateNumber = scanner.nextLine().trim();
        //[] range is kurio ieskom reiksmiu
        //{2} - kiek raidziu gali buti
        //{1,4} - skaiciu gali buti nuo 1-o iki 4-iu
        Pattern pattern1 = Pattern.compile("[a-zA-Z]{2}-[0-9]{1,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);
        //kadangi grazina boolean reiksme true or false
        boolean correctPlate = matcher1.matches();

        if(correctPlate){
            System.out.println("Your inputted plate number is correct");
        }else{
            System.out.println("Your inputted plate number is not correct");

        }

    }
}
