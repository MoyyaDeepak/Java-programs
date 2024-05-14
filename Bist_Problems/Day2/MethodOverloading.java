package Bist_Problems.Day2;

import java.util.Scanner;

public class MethodOverloading {
    
    public static void main(String[] args){
        double r,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r=s.nextDouble();
        b=AreaOfCircle(r);
        System.out.println("Area of Circle: "+b);
        AreaOfCircle();
    }
    
    public static double AreaOfCircle(double ra){
        double area=(22*ra*ra)/7;
        return area;
    }
    public static void AreaOfCircle(){
        double rad,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        rad=s.nextDouble();
        a=(22*rad*rad)/7;
        System.out.println("Area of Circle: "+a);
    }

}
