package Lesson0819oopAbstract;

enum Level {
    EASY, MEDIUM, HARD
}

public class EnumExampla {
    public static void main(String[] args) {

        Level myLevel = Level.EASY;

        switch (myLevel){
            case EASY:
                System.out.println("Level: easy");
                break;
            case MEDIUM:
                System.out.println("Level: medium");
                break;
            case HARD:
                System.out.println("Level: hard");
                break;
        }
    }
}
