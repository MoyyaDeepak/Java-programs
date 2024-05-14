import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=s.nextInt();
        System.out.println("Enter second number: ");
        int n2=s.nextInt();
        while(n1!=n2){
            if(n1>n2){
                n1-=n2;
            }else
                n2-=n1;
        }
        System.out.println("GCD of two numbers is "+n1);
    }
}
