package practise;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverse="";
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i)+reverse;
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(str+" is a palindrome string");
        }else
        System.out.println(str+" is not a palindrome string");
    }
}
