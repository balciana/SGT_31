public class MathClass {
    public static void main(String[] args) {

        float num = 5.154f;

        System.out.println(num);
        //rounding down
        System.out.println(Math.floor(num));

        //rounding up
        System.out.println(Math.ceil(num));

        //rounding according to Math principles
        System.out.println(Math.round(num));
        //Absolute value
        System.out.println(Math.abs(-2));

        //Power
        System.out.println(Math.pow(6, 2));

        //square
        System.out.println(Math.sqrt(64));

        //finding math value between two values
        System.out.println(Math.max(100, 103.6));

        //finding min value 2 values
        System.out.println(Math.min(55, 43));

        //random value from 0 and 1 without * 10
        System.out.println(Math.random() * 10);
        //numbers from 1 to 9
        System.out.println((int) (Math.random() * 10));
        //numbers from 1 to 20
        System.out.println((int) (Math.random() *20) + 1);

        //casting
        System.out.println((int) 99.989);


    }
}
