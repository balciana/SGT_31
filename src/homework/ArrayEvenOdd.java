package homework;

public class ArrayEvenOdd {
    public static void main(String[] args) {


        int table[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < table.length; i++) {
            int value = table[i];
            if (value % 2 == 0) {
                System.out.println("even number: " + value);
            } else {
                System.out.println("odd number: " + value);
            }
        }
    }
}
