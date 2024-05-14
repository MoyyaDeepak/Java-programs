package practise;

import java.util.Scanner;

public class tabp{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int a=sc.nextInt();
    for(int i=1;i<=10;i++){
        int sum=a*i;
        System.out.println(a + "*" + i + "=" +sum);                             //table program
    }
}
}