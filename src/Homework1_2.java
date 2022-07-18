import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");

        float speed = scanner.nextFloat();
        System.out.println(speed + "mp/h in km/h would be equal to " + speed*1.6F + " km/h");

    }
}
