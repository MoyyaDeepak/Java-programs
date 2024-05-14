package practise;

import java.util.Scanner;

public class Vowel_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=s.next().charAt(0);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        System.out.println("The entered character is vowel.");
        else
        System.out.println("The entered character is not an vowel.");
    }
}
