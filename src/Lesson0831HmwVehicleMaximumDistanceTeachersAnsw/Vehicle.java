package Lesson0831HmwVehicleMaximumDistanceTeachersAnsw;

public class Vehicle {
    //using protected you can access in subclass and the same package
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    //custom constructor set multiple
    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }
    //using return to use the value again
    //if using void calling method vehicle.maxDistance();
    //calculating max distance
    //return float value
    //passing in values to method
    public float maxDistance(float fuel, float fuelUsage, int passengers){
        return fuel /  (fuelUsage * (1 + passengers * 0.05f)) * 100;
    }

    //2 example without passing values
    public float maxDistance(){
        return fuel /  (fuelUsage * (1 + passengers * 0.05f)) * 100;

    }




}
