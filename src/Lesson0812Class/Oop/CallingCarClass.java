package Lesson0812Class.Oop;

public class CallingCarClass {
    public static void main(String[] args) {

        //create a new object from car class template
        //set field values
        //call printCarInfo method to check field values

        Car car1 = new Car();
        //car1.brand = "BMW";
        //car1.maxSpeed = 208;
        car1.setColor("Black");
        car1.setBrand("Audi");
        car1.setMaxSpeed(200);

        car1.printCarInfo();

        //Access individual fields
        //System.out.println("Max speed is " + car1.maxSpeed);
        System.out.println("Max speed is " + car1.getMaxSpeed());
        System.out.println("Car's color is " + car1.getColor());


    }
}
