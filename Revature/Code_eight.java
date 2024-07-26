package Revature;

import java.util.Scanner;

public class Code_eight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int g=arr[0]>arr[1]&&arr[0]>arr[n-1]?arr[0]:arr[1]>arr[n-1]?arr[1]:arr[n-1];
        int p=arr[0]*arr[1]*arr[n-1]; 
        for(int i=g;i<=p;i+=16){
            if(i%arr[0]==0 && i%arr[1]==0 && i%arr[n-1]==0){
                break;
            }
            System.out.println(i);
        }
    }
}
