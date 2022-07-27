public class TwoDimensionalArray {
    public static void main(String[] args) {

        int [][] age = new int [][]{{4,5,3,6,5},{34,44,28,38,41}};

        //print second column values
        System.out.println("Child - " + age[0][1]);
        System.out.println("Parent - " + age[1][1]);

        //example 2 sukurem array
        String[][] names = new String [2][5]; //2 rows 5 columns
        //priskiriam reiksmes 1 eilutei
        names [0][0] = "Alice";
        names [0][1] = "Bob";
        names [0][2] = "John";
        names [0][3] = "Lucas";
        names [0][4] = "Joshua";

        //priskiriam reiksmes 2 eilutei
        names [1][0] = "Tyron";
        names [1][1] = "Daren";
        names [1][2] = "Israel";
        names [1][3] = "Cyril";
        names [1][4] = "Lewis";

        //number of rows in2nd array
        System.out.println((names.length));

        //number of columns in specific row
        System.out.println(names[0].length);

        //atspausdinam elementus; nested for loop
        //pirmas loop parodo kiek eiluciu



        // i - rows
        // j = columns

        for(int i = 0; i < names.length; i++){
           //nenaudojam i, o j, ne i jau yra scoop
            System.out.println("Row no. " + (i+1));
            for(int j = 0; j < names [i].length; j++){
                System.out.println(names[i][j]);

            }
       }









    }
}
