package Lesson0817.oop.inheritance;

public class HmwCar extends HmwVehicle {
    private boolean airConditioner;


    public HmwCar(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    @Override
    public void setFuel(float fuel) {
        super.setFuel(fuel);
    }

    @Override
    public void setFuelUsage(float fuelUsage) {
        super.setFuelUsage(fuelUsage);
    }

    @Override
    public void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    @Override
    public float getFuel() {
        return super.getFuel();
    }

    @Override
    public float getFuelUsage() {
        return super.getFuelUsage();
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    private boolean isAirConditioner(boolean airConditioner){
        return airConditioner == true;
    }

    public float maxDistance () {
            float distance = 0.0f;
            if (isAirConditioner(airConditioner)) {
            float consumptionPercentage = (float) (getFuelUsage() * getPassengers() * 0.05);
            float consumptionPercentageAir = (float) ((getFuelUsage() + consumptionPercentage) * 0.1);
            distance = ((getFuel() / (getFuelUsage() + consumptionPercentage + consumptionPercentageAir)) * 100);
        }else{
                float consumptionPercentage = (float) (getFuelUsage() * getPassengers() * 0.05);
                distance = ((getFuel()/(getFuelUsage() + consumptionPercentage)) * 100);
                System.out.println("Without air conditioner");
        }

        return distance;
    }
    }

