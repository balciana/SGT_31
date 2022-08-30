package Lesson0817.oop.inheritance;

public class HmwVehicle {

    //fields
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public float getFuel() {
        return fuel;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public int getPassengers() {
        return passengers;
    }


    public HmwVehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }


    public float maxDistance (){
        float consumptionPercentage = (float) (fuelUsage * passengers * 0.05);
        float distance = ((fuel/(fuelUsage + consumptionPercentage)) * 100);
        return distance;

    }

}


