package assignments;

import java.util.Scanner;

public class usingwhile3 {
    public static void main(String[] args) {       // printing 150 to 200 which are divible by 7 using while
       // int i=150;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the i value");
       int i=sc.nextInt();
    while(i<=200){
        if(i%7==0){
            System.out.println(i);
        }
        i++;
    }
}
}