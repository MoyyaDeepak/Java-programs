package string;

import java.util.Scanner;

public class strass3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        String s1=sc.nextLine();
        char target='l';                                        //to find the number of occurences of a character in the string
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==target){
                count++;
            }
        }
        System.out.println("the number of occurences of " + target + " in the string is " +count);
    }
}
