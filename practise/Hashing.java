package practise;

import java.util.Scanner;

public class Hashing {
    public static int check(int arr[]){         //1,3,1,2,5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){           //1,4,2,6,10
            int count=0;
            for(int k=0;k<n;k++){
                if(arr2[j]==arr[k]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        check(a);
    }
}
