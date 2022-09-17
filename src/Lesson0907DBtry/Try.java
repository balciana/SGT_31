package Lesson0907DBtry;

public class Try {
    public static void main(String[] args) {
        //try catch block

//        int[] numbers = {1,2,3};
//        System.out.println(numbers[3]);
//
//        System.out.println("Hello world!");

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[3]);

        } catch(Exception e){
            //put e to see what is the problem
            System.out.println(e);
            //put a message which appears when is smth wrong
            System.out.println("something went wrong");
        }
        System.out.println("Hello world!");




    }

}
