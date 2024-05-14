package TcsNqt;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   //{4,5,0,1,9,0,5,0}
        }
        //Step-1: Count the number of array packets
        int emptyCount=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                emptyCount++;
            }
        }
        //Step-2: Create a new array to store the result
        int result[]=new int[n];
        int index=0;
        //Step-3: Add non-empty packets to the new array i.e., non -zero values
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                result[index++]=arr[i];
            }
        }
        //Step-4: Fill the remaining positions with zeros
        while(emptyCount>0){
            result[index++]=0;
            emptyCount--;
        }
        for(int i:result){
            System.out.print(i+" ");   //4 5 1 9 5 0 0 0
        }

    }

    public static void sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
