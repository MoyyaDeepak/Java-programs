package Bist_Problems.Day1;

import java.util.Scanner;

public class Wpnv {
    public static void method1(float r){       //A method with parameter no return value
        double area=22*r*r/7;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        method1(s.nextFloat());
    }
}
