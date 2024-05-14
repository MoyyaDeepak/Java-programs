package Bist_Problems.Day2;

import java.util.Scanner;

public class Second {
    double r,area;
    public void getData(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r=s.nextDouble();
    }
    public void calicualte(){
        area=(22*r*r)/7;
    }
    public void output(){
        System.out.println( "The Area of Circle is : "+area);
    }
}
class ObjectEx{
    public static void main(String[] args) {
        Second sb=new Second();
        sb.getData();
        sb.calicualte();
        sb.output();
    }
}
