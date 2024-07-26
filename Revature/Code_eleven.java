package Revature;

import java.util.Scanner;

public class Code_eleven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(findLargestPrime(num));

    }
    public static int findLargestPrime(int num){
        for(int i=num-1;i>1;i--){
            if(isPrime(i)){
                return i;
            }
        }
        return -1;
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
