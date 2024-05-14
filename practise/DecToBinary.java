package practise;

import java.util.Scanner;

public class DecToBinary {
    public void conversion(int n){
        String binary=" ";
        while(n>0){
            int rem=n%2;
            binary=rem+binary;
            n/=2;
        }
        System.out.println("The binary value of the decimal number is :"+binary);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        DecToBinary db=new DecToBinary();
        int val=s.nextInt();
        db.conversion(val);
    }
}
