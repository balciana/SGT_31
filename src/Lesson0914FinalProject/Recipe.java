package Lesson0914FinalProject;

import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do? (r,t,n,s)");
        System.out.println("r - find the recipe by random choice");
        System.out.println("t - find a random recipe fallowing by season");
        System.out.println("n - add a new recipe");
        System.out.println("s - stop the program");
        String choice = scanner.nextLine();

    }


}
