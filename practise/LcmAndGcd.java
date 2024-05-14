package practise;

import java.math.BigInteger;
import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        BigInteger num1= new BigInteger(a);
        BigInteger num2= new BigInteger(b);
        BigInteger lcm=num1.multiply(num2).abs().divide(num1.gcd(num2));
        BigInteger gcd=num1.gcd(num2);
        System.out.println(lcm);
        System.out.println(gcd);
    }
}
