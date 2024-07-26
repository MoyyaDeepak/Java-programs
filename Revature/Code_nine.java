package Revature;

import java.util.Scanner;

public class Code_nine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        System.out.println(countPowerOfTwo(A));
    }
    public static int countPowerOfTwo(int input){
        int count=0;
        int power=1;
        while(power<=input){
            count++;
            // if(power>Integer.MAX_VALUE/2){
            //     break;
            // }
            power*=2;
        }
        return count;
    }
}
