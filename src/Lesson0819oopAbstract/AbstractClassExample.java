package Lesson0819oopAbstract;

abstract class Animal{
 protected String name;
 public void sleep(){
  System.out.println("zzzzzz");
 }
 public abstract void animalSound();
}

class Pig extends Animal{
 public void animalSound(){
  System.out.println("oink oink");

 }

}

class Dog extends Animal{
 public void animalSound() {
  System.out.println("bark bark");
 }
}

public class AbstractClassExample {
  public static void main(String[] args) {

   Pig pig = new Pig();
   pig.sleep();
   pig.name = "Peppe";
   pig.animalSound();

  }

}
