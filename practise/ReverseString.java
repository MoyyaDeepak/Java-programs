package practise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[]=new String[2];
        System.out.println("Enter the two strings");
        for (int i = 0; i < 2; i++) {
            s1[i]=sc.nextLine();
        }
        for(int j=s1.length-1;j>=0;j--){
            System.out.print(s1[j]+" ");
        }
    }
}
