package Revature;

import java.util.Scanner;

public class Code_two {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }                                      //Mathematic calculation: Arithmetic progression
        int d=arr[1]-arr[0];
        int a=arr[0];
        int r= (n/2)*(2*a+(n-1)*d);
        System.out.println(r);
    }
}
