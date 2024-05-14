package arrays.TwoDArr;

import java.util.Scanner;

public class MaxRevenue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N=s.nextInt();
        System.out.print("Enter the number of columns: ");
        int M=s.nextInt();
        int arr[][] = new int[N] [M];
        System.out.println("Enter elements ");
        // int max=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
