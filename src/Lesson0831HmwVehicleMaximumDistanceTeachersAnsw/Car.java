package Lesson0831HmwVehicleMaximumDistanceTeachersAnsw;

//subclass of vehicle extends
public class Car extends Vehicle{
    //kad neraudonotu turim sukurti custom constructor su super

    boolean airConditioner;
    //custom constructor
    //define inputs of arguments
    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        //reuse similar values call super method
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;

    }

    public float maxDistance(){
        //checking if boolean is true or false
        float airConditionerAdd;
        //checking boolean just write airConditioner
        if(airConditioner){
            airConditionerAdd = 1.1f;
        }else{
            airConditionerAdd = 1f;
        }
        float usage = fuelUsage * (1 + passengers * 0.05f);
        float maxDistance = fuel / (usage * airConditionerAdd) * 100;
        return maxDistance;
    }


}
