package Lesson0803_05;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
       String text1 = "This is text example";
       //text2 priskiriam text1 reiksme metodas intern
        // tas pats kas: String text2 = text1;
       String text2 = text1.intern();
       System.out.println(text2);

       //concatenation of strings

        String input1 = "This is ";
        String input2 = "input text.";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //comparing strings, gives answer true or false
        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));
        System.out.println(val2.equals(val1));

        //String class methods
        String inputText = "This is my text";

        //Length
        System.out.println(inputText.length());
        //ats 15, nes String array of characters: kiekvienas simboliai ir tarpai skaiciuojasi

        //naudinga naudoti kai ivedam reiksmes ir jas ivedam diziaja ar mazaja reiksme
        //to uppercase padaro raides uppercase THIS IS MY TEXT
        System.out.println(inputText.toUpperCase());//output value
        System.out.println(inputText);//ims pirmine reiksme, o ne didziosiomis raidemis
        //lowercase atspausdina mazosiomis raidemis
        System.out.println(inputText.toLowerCase());

        //indexof()
        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));//nurodo e vieta, skaiciuojasi nuo 0
        System.out.println(speakingText.indexOf("is"));//ats 2, nes this -> 0-t 1-h i-2 s-3, is prasideda nuo 2
        System.out.println(speakingText.indexOf(" is "));//ats 4, randa zodi "is" su tarpais

        //replaceAll() replace old value with new
        //Šūdas pakeisti bloga zodi
        String textForTv = "This phone is complete šūdas. And this case is also šūdas.";
        System.out.println(textForTv);
        System.out.println(textForTv.replaceAll("šūdas", "š***s" ));

        //character index
        System.out.println(textForTv.charAt(5));//spec character at specific index
        //randam paskutini index
        System.out.println(textForTv.charAt(textForTv.length()-1));

        //substring - pradeda sakini nuo pavyzdziui 5.
        System.out.println(textForTv.substring(5));
        //atspausdina simbolius pvz., nuo 5 iki 10
        System.out.println(textForTv.substring(5, 10));

        //Parsing
        //converting String to other primitive data types
        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.45454545453";
        String boolValue = "true";
        String longValue = "1000000000000000";

        //rasom methoda is didziosios raides
        System.out.println(Integer.parseInt(intValue) + 4);
     System.out.println(Float.parseFloat(floatValue));
     System.out.println(Double.parseDouble(doubleValue));
     System.out.println(Boolean.parseBoolean(boolValue));
     System.out.println(Long.parseLong(longValue));

     //Trim method - istrina visus spaces pradzioje ir gale
     System.out.println("    This is test    ".trim());

     Scanner scanner = new Scanner(System.in);
     //tikrinam ar atitinka paswordas su suvestu naudotojo
     System.out.println("Please enter password (qwert*)");
     String pswd = scanner.nextLine().trim().toLowerCase();
     //trim -perskaitys ivesta reiksme ir padarys be tarpu
    //toLowerCase - pavers viska mazosiomis raidemis

     //prilyginti reiksmei naudojam equals methoda, grizta true or false
     //tikrinimas jautrus tarpams
     if (pswd.equals("qwerty")){
      System.out.println("Password correct");
     } else {
      System.out.println("Incorrect password");

     }






    }
}
