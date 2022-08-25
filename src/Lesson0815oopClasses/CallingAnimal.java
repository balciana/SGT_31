package Lesson0815oopClasses;

public class CallingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cat", "Maine coon", 10.4f,14);
        animal1.printAnimalInfo();

        //we defining only 3 values if want to call another constructor

        Animal animal2 = new Animal("Dog", "Toy Poodle", 3.1f);
        animal2.printAnimalInfo();
        animal2.setAvgLifespan(20);
        animal2.printAnimalInfo();

        Animal animal3 = new Animal();

    }
}
