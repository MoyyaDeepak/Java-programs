package Revature;

import java.util.Scanner;

public class Code_one {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int b=s.nextInt();

        int c=0;                       //HASHING SHIFTED CIPHER
        int t=10;
        int x=a;

        while (x!=b) { 
            x=(x*t)+a;
            c++;
            t*=10;
        }
        System.out.println(c);
    }
}
