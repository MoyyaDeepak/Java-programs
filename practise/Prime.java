package practise;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    int n,count=0;
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
        if(count==2){
            System.out.println("It is a prime number");
        }else
            System.out.println("It is not a prime number");
    }
    
}
