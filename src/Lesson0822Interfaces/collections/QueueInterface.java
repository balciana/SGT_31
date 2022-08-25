package Lesson0822Interfaces.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        //prideda elementus, add turi index
        Queue<String> car = new LinkedList<>();
        car.add("Volvo");
        System.out.println(car);
        //prideda elementus
        //galima atspausdint sout(car.offer("Toyota") grazina reiksme true or false
        car.offer("Toyota");
        System.out.println(car);

        System.out.println(car.peek());
        System.out.println(car);

        System.out.println(car.poll());
        System.out.println(car);

    }
}
