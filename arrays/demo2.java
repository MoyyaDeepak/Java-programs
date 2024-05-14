package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        // int[] arr={1,2,3};
        // //for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr));
        // }
                Scanner s=new Scanner(System.in);
                int n=s.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
                System.out.println(Arrays.toString(arr));
        }
    }

