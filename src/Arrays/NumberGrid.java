package Arrays;

public class NumberGrid {
    public static void main(String[] args) {
        //create java program that would given an output a grid like this, use this two dimensional array to get value from
        //int [] [] array = {{1,2,3}, {4,5,6}, {7,8,9}}
        //using nested loops print out each elements in the array
        int [][] array = {{1,2,3}, {4,5,6},{7,8,9}};


        for(int i = 0; i < array.length; i++){
        //array lenght kiek eiluciu

            for(int j = 0; j < array [i].length; j++){
                //kiek elementu eiluteje array []
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            //tuscia eilute po for loop vidinio, kad spausdintu 3 eilutes
        }

        System.out.println();

        for (int [] tempArray : array){
            for (int arrayNumbers: tempArray) {
                System.out.print(arrayNumbers + " ");
            }
            System.out.println();
        }
    }
}
