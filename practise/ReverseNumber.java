package practise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int rev=0,rem;
        while(i>0){
            rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        System.out.println(rev);
    }
}
