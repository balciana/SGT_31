package Lesson0815oopClasses;

public class Triangle {
    //fields
   private double side1;
   private double side2;
   private double side3;

    //setter methods
    public void setSide1(double side1) {
    this.side1 = side1;
    }

    public void setSide2(double side2) {
    this.side2 = side2;
    }

    public void setSide3 (double side3) {
    this.side3 = side3;
    }
    //getter methods

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    //method for checking if it is possible to do triangle
    private boolean isValid(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;

    }
    //we do not need to set any inputs as we already have them on top
    public double triangleArea(){
        //holding result of calculated area
        double area;
        if(isValid(side1, side2, side3)){
            //formule trikampio area apskiciuoti
            //apskaiciuojam puse perimetro
            double halfPer = (side1 + side2 + side3)/2;
            //istraukiam sakni
            area = Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
        }else{
            System.out.println("Triangle is not valid");
            area = 0.0D;
        }
        return area;

    }
}


