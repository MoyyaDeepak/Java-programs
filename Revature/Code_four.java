package Revature;

import java.util.Scanner;

public class Code_four {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input="hello world";
        System.out.println(reverseWord(input));
    }
    public static String reverseWord(String input){
        String reverse[]=input.split(" ");
        String output="";
        for(int i=reverse.length-1;i>=0;i--){
            output+=reverse[i]+" ";
        }
        return output;
    }
}
