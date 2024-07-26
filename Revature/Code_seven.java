package Revature;

import java.util.Scanner;

public class Code_seven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt(), b=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i+"\nFizzBuzz");
            }else if(i%a==0){
                System.out.println(i+"\nFizz");
            }else if(i%b==0){
                System.out.println(i+"\nBuzz");
            }else 
            System.out.println(i);
        }
    }
}
