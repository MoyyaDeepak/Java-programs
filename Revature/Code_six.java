package Revature;

import java.util.Scanner;

public class Code_six {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double b=s.nextDouble();
        double h=s.nextDouble();
        double l=s.nextDouble();

        double v=0.5*b*h*l;
        System.out.printf("%.2f%n", v);
    }
}
