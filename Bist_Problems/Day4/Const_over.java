package Bist_Problems.Day4;

import java.util.Scanner;

class AreaOfCircle {
    double r,area;
   
    public void AreaofCircle(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r=s.nextDouble() ;
    }
    public void AreaofCircle(AreaOfCircle a){
        r=a.r;
    }
    public void calculate(){
        area=(22*r*r)/7;
    }
    public void display(){
        System.out.print("Area of Circle ");
        System.out.print("with "+r);
        System.out.print(" radius is "+area);
    }
}
class Const_over{
    public static void main(String[] args) {
        AreaOfCircle a1, a2;
        a1=new AreaOfCircle();
        a1.calculate();
        a1.display();
        a2=new AreaOfCircle();
        a2.calculate();
        a2.display();

    }
}

