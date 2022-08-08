package Lesson0803_05;

import java.util.Scanner;

public class StringInputPractiseTeachersSol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name Name and Age (John 30)");

        //declare
        //1 read string from user and get rid of space (trim)
        //2 get substring of last two characters in the string
        //3 Convert those to integer
        //4 if age is over 70 the print "Senior" if not then print "Adult"

        //1
        String input = scanner.nextLine().trim();
        //2 - naudojam length metoda, kad gauti 2 paskutinius elementus
        //kadangi paskutinis elementas bus lenght-1, tai priespaskutinis skaicius bus lenght-2
        //elementu index skaiciuojasi nuo 0,1,2...
        //tikrinam (Substring - additional info)-
        System.out.println("Substring " + input.substring(input.length()-2));

        //konvertuojam paskutinius string elementus i integer su Integer.parseInt metodu
        int age = Integer.parseInt(input.substring(input.length()-2));

        if (age >= 70){
            System.out.println("Senior");
        } else{
            System.out.println("Adult");
        }

    }
}
