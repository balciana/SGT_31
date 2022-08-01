package homework;

//copy an array
//create an array (int type) put some random values in array and print out all elements (Source Array)
//Create a new empty array same size and type as first array
//Loop through all elements from first array and put same elements in new array
//Print out all elements from new array and it should the same as first one

import java.util.Arrays;

public class HmwCopyArray {
    public static void main(String[] args) {
    int [] myArray = {1,2,3,4,5};

        System.out.println("Source Array: " + Arrays.toString(myArray));

        int [] newArray = new int [myArray.length];

        for(int i = 0; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }

        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
