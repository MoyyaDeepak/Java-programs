package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        int i[]=new int[length];
        System.out.println("enter the elements ");
        for(int a=0;a<i.length;a++){
            i[a]=sc.nextInt();
        }
        System.out.println(Arrays.toString(i));
    }
}
