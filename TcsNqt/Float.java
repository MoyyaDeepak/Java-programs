package TcsNqt;

import java.util.Scanner;

public class Float {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        float c=s.nextFloat(), d=s.nextFloat();
        System.out.print(a+b);
        System.out.print(" ");
        System.out.println(a-b);
        System.out.print(c+d);
        System.out.print(" ");
        System.out.println(c-d);
    }
}
