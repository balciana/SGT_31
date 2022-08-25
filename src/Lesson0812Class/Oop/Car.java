package Lesson0812Class.Oop;

public class Car {
    //define Fields
    private String color;
    private String brand;
    private int maxSpeed;

    //Methods

    //setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){
        this.color = color;

    }
    //getter methods

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor(){
        return color;

    }

    public void printCarInfo(){
        System.out.println("Car info:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Maximum speed: " + maxSpeed);

    }
}
