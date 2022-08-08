package Lesson0803_05;

public class PrintFormating {
    public static void main(String[] args) {
    String name = "Bob";
    int age = 29;

    System.out.println("Hello " + name + " your age is " + age);

    //printf method f easer to print
        // s - string
        // d - decimal/integers
        // f - float, double
        // c - char
        // b - boolean

        //dedam % ir s, d ar kitas
        //po kableleliu nurodome eiliskumo tvarka reiksmes, pvz.: name, age
        //\n nauja eilute

        System.out.printf("Hello %s your age is %d \n", name, age);

        //if more than one for example string value
        System.out.printf("Hello %s your age is %s \n", name, name);

        //galima irasyti vietoj variable, kita reiksme pvz
        System.out.printf("Hello %s your age is %s \n", name, "Ana");

        //kai reikia panaudoti daugiau kartu ta pati variable
        //%1$s , %2$d...pagal value eiliskuma duodam numerius; visoms values rasom taip
        System.out.printf("Hello %1$s your age is %2$d. Nice to meet you %1$s \n", name, age);

        double height = 192.453452d;
        System.out.printf("%s is %f cm tall \n", name, height);
        //norim sumazinti skaicius po kableliu - %.skaicius kiek norime matyti sk po kableliu
        System.out.printf("%s is %.2f cm tall", name, height);

    }
}
