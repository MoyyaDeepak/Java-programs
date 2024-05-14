package Bist_Problems.Day1;

import java.util.Scanner;

public class Npnv {
     public static void method1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter r value: ");                   //A method with no parameter and no return value
        float r = s.nextFloat();
        float area=22*(r*r)/7;
        System.out.println(area);
    }
    public static void main(String[] args) {
        method1();
    }
}
