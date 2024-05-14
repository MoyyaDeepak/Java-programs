package practise;

import java.util.Scanner;

class prac2 {
    private static final int N = 0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int result=0;
        for(int N=1;N<=10;N++){
            result=i*N;
        }
        System.out.println(i+" x "+ N +" = "+ result);
    }
}