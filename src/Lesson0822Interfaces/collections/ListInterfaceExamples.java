package Lesson0822Interfaces.collections;

import java.util.ArrayList;

public class ListInterfaceExamples {
    public static void main(String[] args) {

        //ArrayList Decoration
        ArrayList<String> car = new ArrayList<String>();

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all elements
        System.out.println(car);

        //get lements by index
        System.out.println(car.get(1));

        //add element at specific index
        car.add(2, "Ford");
        System.out.println(car);

        //Change element value
        car.set(3, "Toyota");
        System.out.println(car);

        //Remove element at index
        car.remove(5);
        System.out.println(car);

        //size
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);






    }
}
