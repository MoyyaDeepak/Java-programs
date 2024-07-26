package arrays;
import java.util.*;

class UnionOfTwoSortedArrays{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=s.nextInt(); 
        System.out.println("Enter the value of m: ");
        int m=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        System.out.println("Enter the array 1 values: ");
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the array 2 values: ");
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        int result[]=union(arr1, arr2, n, m);
        System.out.println(Arrays.toString(result));
    }
    public static int[] union(int[] arr1, int[] arr2, int n, int m){
        int k=0;
        int temp[]=new int[n+m];
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                temp[k++]=arr1[i++];
            }else{
                temp[k++]=arr2[j++];
            }
        }
        while(i==n && j<m){
            temp[k++]=arr2[j++];
        }
        while(j==m && i<n){
            temp[k++]=arr1[i++];
        }
        return Arrays.copyOf(temp, k);
    }
}