package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        a=a.replace(" ", "").toLowerCase();
        b=b.replace(" ", "").toLowerCase();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c, d))
        System.out.println("It is an anagram");
        else
        System.out.println("It is not an anagram");
    }
}
