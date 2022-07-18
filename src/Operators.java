public class Operators {
    public static void main(String[] args) {

        //math operators + - / * %
       int x = 100;
       x += 100;
       //x = x + 100;
        x = 3;
        System.out.println("x = " + x);

        int y = 100;
        y -= 100;
        System.out.println(y);

        //incrementation operators
        //post-incrementation;

        int num = 10;
        System.out.println("num = " + num++);
        System.out.println("num = " + num);

        //pre-incr
        int num2 = 20;
        System.out.println("num2 = " + ++num2);

        //increase or decrease variable by one
        int var = 10;
        var += 1;
        var = var + 1;
        ++var;
        var++;

        var -= 1;
        var = var -1;
        --var;
        var--;
        System.out.println(var);

        //relation operators
        //equality
        int a = 1;
        int b = 10;
        System.out.println("Equality = " + (a == b)); //is a equal to b
     System.out.println("ineaquality = "  + (a != b));


     System.out.println(a > b);
     System.out.println(a >= b);

     //Less than < and less than or equal to <=
     System.out.println(a < b);
     System.out.println(a <= b);

     //log oper
     //and &&
     boolean wind = false;
     boolean wheather = true;
     System.out.println(wind && wheather);

     //log or ||
     boolean sale = false;
     boolean rich = true;
     System.out.println(sale || rich);



    }
}
