package string;

import java.util.Scanner;

public class strass5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original string :");              //to reverse the given string
        String s1=sc.nextLine();
        //String s1="hello";
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--){
            reverse=reverse+s1.charAt(i);
        }
        System.out.println("Reverse string : \n" +reverse);
    }
}
