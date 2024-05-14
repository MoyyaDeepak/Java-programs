package practise;

import java.util.Scanner;

public  class dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x value");
        int x=sc.nextInt();
        System.out.println("enter the y value");
        int y=sc.nextInt();
        if(x+y<=6){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
