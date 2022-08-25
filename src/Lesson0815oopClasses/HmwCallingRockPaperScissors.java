package Lesson0815oopClasses;

import java.util.Scanner;

public class HmwCallingRockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1: Enter \"rock\" or \"paper\" or \"scissors\"");
        String choice1 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
        System.out.println("Player 2: Enter \"rock\" or \"paper\" or \"scissors\"");
        String choice2 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");

        //creating an object
        HmwRockPaperScissors game1 = new HmwRockPaperScissors();
        game1.setChoice1(choice1);
        game1.setChoice2(choice2);

        System.out.println(game1.rockPaperScissors());

    }
}
