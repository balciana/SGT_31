package Lesson0817.oop.inheritance;

public class HmwCallingVehicle {
    public static void main(String[] args) {
        HmwVehicle hmwVehicle1 = new HmwVehicle(70.0f, 7.0f, 0);
        System.out.printf("Maximum Distance is %.2f km", hmwVehicle1.maxDistance());

        System.out.println();

        HmwVehicle hmwVehicle2 = new HmwVehicle(55.5f, 5.5f,5);
        System.out.printf("Maximum Distance is %.2f km", hmwVehicle2.maxDistance());

        System.out.println();

        HmwCar hmwCar1 = new HmwCar(70.0f, 7.0f, 0, true);
        System.out.printf("Maximum Distance is %.2f km", hmwCar1.maxDistance());
        System.out.println();

        HmwCar hmwCar2 = new HmwCar(36.1f, 8.6f, 3, true);
        System.out.printf("Maximum Distance is %.2f km", hmwCar2.maxDistance());
        System.out.println();

        HmwCar hmwCar = new HmwCar(70.0f, 7.0f, 0, false);
        System.out.printf("Maximum Distance is %.2f km", hmwCar.maxDistance());

    }
}
