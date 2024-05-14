package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr_sort {
    public static void main(String[] args) {              //merge sort array
        int arr1[]=new int[3];
        int arr2[]=new int[2];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the values: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        int length=arr1.length+arr2.length;
        int[] arr3=new int[length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        Arrays.sort(arr3);
        System.out.println("\n"+Arrays.toString(arr3));
    }
}
