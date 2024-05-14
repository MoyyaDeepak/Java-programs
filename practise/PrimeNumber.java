package practise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;
        int n=s.nextInt();
        int count=0;
        while(i<=n){
            if(n%i==0){
            count++;
            }
            i++;
        }
        if(count==2)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
    }
}
