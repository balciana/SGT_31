public class ArrayExamples {
    public static void main(String[] args) {

        //declare array that will hold 3 String type variables
   String [] names = new String[3];

   //how to set array's element values
        names [0] = "Ana";
        names [1] = "Onute";
        names [2] = "Petras";

        //how to get array's elements value
        System.out.println(names[0]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 1;
        grades[3] = 7;
        grades[4] = 5;
        grades[5] = 2;
        grades[6] = 9;
        grades[7] = 10;
        grades[8] = 6;
        grades[9] = 4;

        //get size of array; how to get Array's size
        System.out.println("Array's size: " + grades.length);

        //print out all elements
//        System.out.println(grades[0]);
//        System.out.println(grades[1]);
//        System.out.println(grades[2]);
//        System.out.println(grades[3]);

        for(int i = 0; i < grades.length; i++){
             System.out.print(grades[i] + " ");

        }



    }
}
