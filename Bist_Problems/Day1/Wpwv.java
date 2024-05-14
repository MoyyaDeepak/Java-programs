package Bist_Problems.Day1;

import java.util.Scanner;

public class Wpwv {
    public static float method1(float r){
        float area=22*r*r/7;                     //A method with parameter with return value
        return area;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value: ");
        float f=s.nextFloat();
        float ra=method1(f);
        System.out.println(ra);
    }
}
