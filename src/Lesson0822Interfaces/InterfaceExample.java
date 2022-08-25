package Lesson0822Interfaces;

interface Bug{
    public void bugSound();
    public void bugSize();

}

interface Location{
    public void location();
}

class Ant implements Bug, Location{
    public void bugSound(){
        System.out.println("Tsss");
    }

    public void bugSize() {
        System.out.println("Small");
    }

    @Override
    public void location() {
        System.out.println("Located in forest");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();


    }
}
