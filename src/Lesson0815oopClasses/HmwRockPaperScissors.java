package Lesson0815oopClasses;

public class HmwRockPaperScissors {
    //fields
    private String choice1;
    private String choice2;


    //setter methods


    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2(String choice2) {
        return this.choice2;
    }

    private boolean isValid(String choice1, String choice2){
        return (choice1.equals("rock") || choice1.equals("paper") || choice1.equals("scissors")) && (choice2.equals("rock") || choice2.equals("paper") || choice2.equals("scissors"));
    }

    public String rockPaperScissors() {
        String result = " ";
        if (isValid(choice1, choice2)) {


            if ((choice1.equals("rock")) && (choice2.equals("scissors")) || (choice1.equals("scissors")) && (choice2.equals("paper")) ||(choice1.equals("paper")) && (choice2.equals("rock"))) {
                result = "Player 1 wins";

            } else if ((choice1.equals("rock")) && (choice2.equals("paper")) || (choice1.equals("scissors")) && (choice2.equals("rock")) || (choice1.equals("paper")) && (choice2.equals("scissors"))) {
                result = "Player 2 wins";}

             else if ((choice1.equals(choice2))) {
                result = "TIE";

            } else {
                System.out.println("You put wrong values! Please enter \"rock\" or \"paper\" or \"scissors\"");
            }

        } else {
            System.out.println("You put wrong values! Please enter \"rock\" or \"paper\" or \"scissors\"");
        }
        return result;
    }

}
