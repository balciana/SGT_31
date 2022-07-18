import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score");
        float score = scanner.nextFloat();

        if (score <= 40.0f) {
            System.out.println("score: <= 40%");
        //galime istrinti daugiau uz 40 po else if
        } else if (score > 40.0f && score <= 80.0f){
            System.out.println("40 % < score <=80%");
            if (score <= 70.0f){
                System.out.println("<=70");
            } else {
                System.out.println("> 70");
            }

        } else {
            System.out.println("80% < score <= 100%");
            //cast score to int type
            //and determine if score is odd or even and print
        }


        //System.out.println((int)Math.round(score));
        //int myScore = (int) score; kai reikia naudoti daugiau kartu
        if((int)score%2 == 0){
            System.out.println("Odd number");

        } else {
            System.out.println("Even number");
        }
    }
}
