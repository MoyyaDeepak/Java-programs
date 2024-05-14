package Gov;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner s=new Scanner(System.in);
        int term=s.nextInt();
        for(int i=1;i<=term;i++){
            // System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
        }
        int term2=s.nextInt();
        for(int j=term;j<=term2;j++){
            // System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            if(a%2==0){
                
                System.out.print(a+" ");
            }
        }
    }
}
