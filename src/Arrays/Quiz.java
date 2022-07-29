package Arrays;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //1.create a two dimensional String type size[4][4] array named quizArray and provide each row with question and 3 answers
        //pirma declaruojame tuscia array 2D array
        //fill array with values
        //print all values and format in given way

        //lengviau suradti komentarus rasomtodo
        //TODO
        // Ask input after each question


        Scanner scanner = new Scanner(System.in);//3
        //pirma deklaruojam tuscia array
        String [][] quizArray = new String [4][4];
        int [] answer = {3,1,2,2};//2.deklaruojam teisingus atsakymus po array reiksmiu uzpildymo
        int score = 0; //5.deklaruojam score

        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San Paulo";

        quizArray[3][0] = "Capital city of Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";

        for (int i = 0; i < quizArray.length; i++){
            //[i] priskiriam i, kad nuskaitytu 4 stulpelius pirmas reiksmes
            System.out.println(quizArray[i][0]);//question
            //j priskiriam 1, nes norim, kad atspausdintu sekancias reiksmes eiluteje pradedant nuo 2os reiksmes1)
            for(int j = 1; j < quizArray [i].length; j++){//answers
                System.out.println("\t" + j + ")" + quizArray[i][j]);
                //\t padaro tarpus

            }
            //3.paprasome po kiekvieno klausimo ir atsakymu suvesti atsakymo numeri
            System.out.println("Answer: ");
            int answerInput = scanner.nextInt();
            //int answerInput galim deklaruoti virsuje

            //4.pryliginam atsakyma gerai ar blogai
            //range of i, tai imam i nes paima skaicius nuo 0 iki 3 is array
            if (answerInput == answer[i]) {
                System.out.println("Correct!");
                System.out.println("-------------------");
                System.out.println("-------------------");
                score++;//skaiciuojam teisingus atsakymus
            } else {
                System.out.println("False :(");
                System.out.println("-------------------");
                System.out.println("-------------------");
            }


        }
        //5 einam is for loop
        //atspausdinam teisingu atsakymu rezultata

        System.out.println("You answered correct to " + score + " questions");

        //2.create an array that will store correct answers for each question
        //deklaruojame pradzioje prie array int[] answer = {3,1,2,2}

        //3.After each question and answers are printed out ask for user
        //deklaruojam scanner pradzioje
        //paprasome ivesti reiksme
//        System.out.println("Answer: ");
//        int answerInput = scanner.nextInt();

        //4.Create if else statement for checking if the answer for each question is correct.
        //5 create score, deklaruojam pradzioje


//        for (String [] tempArray : quizArray){
//
//            for (String quizAnswers: tempArray) {
//                System.out.print(" " + quizAnswers + " ");
//                System.out.println();
//            }
//            System.out.println();
//        }


    }

}
