package Revature;

import java.util.Scanner;

public class Code_three {
    public static void main(String[] args) {          //Sum of perfect squares in an array.
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(squareRoot(arr));
    }
    public static int squareRoot(int[] arr){
        int sum=0; 
        boolean foundPerfectSquare=false;
        for(int i=0;i<arr.length;i++){
            int sqrt=(int) Math.sqrt(arr[i]);
            if(sqrt*sqrt==arr[i]){
                sum+=arr[i];
                foundPerfectSquare=true;
            }
        }
        if(foundPerfectSquare){
            return sum;
        }else 
        return -1;
    }
}
