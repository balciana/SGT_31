package Lesson0815oopClasses;

import java.util.Scanner;

public class CallingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        //creating triangle object

        Triangle triangle1 = new Triangle();
        triangle1.setSide1(side1);
        triangle1.setSide2(side2);
        triangle1.setSide3(side3);

        //triangle1.triangleArea();
        //atspausdinam rezultata
        System.out.println(triangle1.triangleArea());
        System.out.printf("Your triangle area is %.2f cm2", triangle1.triangleArea());
        //suapvalinam iki dvieju skaiciu rezultata po % rasom skaiciu kiek norime matyti po kableliu
    }

}