package Revature;

import java.util.Scanner;

public class Code_ten {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int d[]=new int[a];
        for(int i=0;i<a;i++){
            d[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if((d[i]^d[j])==b){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
