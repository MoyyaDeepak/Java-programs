package Bist_Problems.Day3;

import java.util.Scanner;

class AreaofCircle{
    double r,area;
    public AreaofCircle(double ra){
        r=ra;
    }
    public void area(){
        area=(22*r*r)/7;
    }
    public void display(){
        System.out.print("Area of Circle ");
        System.out.print("with "+r);
        System.out.print(" radius is "+area);
    }
}
class Constructor{
    public static void main(String[] args) {
        double rad;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        rad=s.nextDouble();
        AreaofCircle a=new AreaofCircle(rad);
        a.area();
        a.display();
        a.area();
    }
}