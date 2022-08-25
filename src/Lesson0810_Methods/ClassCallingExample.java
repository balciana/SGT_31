package Lesson0810_Methods;

import static Lesson0810_Methods.HmwMinMaxMethods.max;
import static Lesson0810_Methods.HmwMinMaxMethods.min;
//jei norim, kad importuotu visu metodus gale rasome *: Lesson0810_Methods.HmwMinMaxMethods.*
public class ClassCallingExample {
    public static void main(String[] args) {

        int[] my_array = {18, 243, 64, 23, 62, 534, 234, 54, 4, 46, 600};

        //importuojam min ar kita metoda uzeje ant pvz min ir pasirenkam metoda
        //virsuje pasirodo eilute su importuojamu metodu
        System.out.println(min(my_array));
        System.out.println(max(my_array));
    }
}
