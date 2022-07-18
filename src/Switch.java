public class Switch {
    public static void main(String[] args) {

        int month = 2;


        switch (month){
            case 1:
                System.out.println("In January there is 31");
                break;
            case 2:
                System.out.println("In February there is 28");
                break;
            default:
                System.out.println("Please enter number between 1 - 12");
                break;
        }
    }
}
