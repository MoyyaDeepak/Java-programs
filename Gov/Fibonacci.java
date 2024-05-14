package Gov;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner s=new Scanner(System.in);
        int term=s.nextInt();
        for(int i=1;i<=term;i++){
            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
