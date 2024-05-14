package Bist_Problems.Day1;

import java.util.Scanner;

public class Npwv {
    public static float method1(){          //A method with no parameter with return value
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value: ");
        float r=s.nextFloat();
        float area=22*r*r/7;
        System.out.println(area);
        return 0;
    }
    public static void main(String[] args) {
        method1();
    }
}
