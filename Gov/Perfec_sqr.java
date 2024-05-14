package Gov;

import java.util.Scanner;

public class Perfec_sqr {                          //To find it is a perfect square or not 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        long i=0;
        for( i=1;i*i<num;i++);
            if(i*i==num){
                System.out.println(num+" is a perfect square");
            }else
            System.out.println(num+" is not a perfect square");        
    }
}
