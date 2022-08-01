import java.util.Scanner;

public class ReadTwoNumbersConditions {
    public static void main(String[] args) {
        /*Write an application, that will read two numbers from user (of type int)
and will print true, if both numbers are the same sign (both are positive,
or both are negative), or false otherwise. If at least one of given numbers
is equal to 0, your application should print false.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int input1 = scanner.nextInt();

        System.out.println("Please enter second number");
        int input2 = scanner.nextInt();

        //ar input1 ir 2 yra teigiamas
        //ar input1 ir 2 yra neigiami
        if((input1>0 && input2>0)||(input1<0 &&input2<0)){
            System.out.println(true);
        }else{
            System.out.println(false);

        }
    }
}
