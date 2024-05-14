package practise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt(); 
        int original=i;  
        int rev=0,rem;
        while(original>0){
            rem=original%10;
            rev=rev*10+rem;
            original=original/10;
        }

        if(i==rev)
        System.out.println(i+ " is a palindrome");
        else
        System.out.println(i+ " is not a palindrome");
    }
}
