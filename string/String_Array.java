package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add:");
        int n=s.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter "+n+" strings:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
