package Gov;

import java.util.Scanner;

public class Examp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add:");
        int  n =s.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.next();
        }
        for(String word:arr){
            if(word.length()>=8){
                char c1=word.charAt(0);
                char c2=word.charAt(word.length()-1);
                int k=word.length()-2;
                char first=c1;
                char last=c2;
                char c3=(char)(c1+1);
                char c4=(char)(c2+1);
                first=(c1=='z')?'a':(c1=='Z')?'A':c3;
                last=(c2=='z')?'a':(c2=='Z')?'A':c4;
                System.out.println(first+""+k+""+last);
            }else
            System.out.println(word);
        }
    }
}
