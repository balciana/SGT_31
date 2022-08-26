package Lesson0815oopClasses;

import java.util.Scanner;

public class HmwCallingRockPaperScissorsSpockLizard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1: Enter \"rock\" or \"paper\" or \"scissors\" or \"spock\" or \"lizard\"");
        String choice1 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
        System.out.println("Player 2: Enter \"rock\" or \"paper\" or \"scissors\" or \"spock\" or \"lizard\"");
        String choice2 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");

        //creating an object
        HmwRockPaperScissorsSpockLizard game2 = new HmwRockPaperScissorsSpockLizard();
        game2.setChoice1(choice1);
        game2.setChoice2(choice2);

        System.out.println(game2.rockPaperScissorsSpockLizard());
    }
}
