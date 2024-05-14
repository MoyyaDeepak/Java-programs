package practise;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        int n=sc.nextInt();                          //compute sum of digits
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
