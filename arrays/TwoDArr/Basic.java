package arrays.TwoDArr;

import java.util.Scanner;

public class Basic {
    public void array(){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int n=s.nextInt();
        System.out.print("Enter the value of column: ");
        int m=s.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the values ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Basic b=new Basic();
        b.array();
    }
}
