package arrays;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int arr1[]={1,2,3},arr2[]={4,5,6};
        int length=arr1.length+arr2.length;
        int arr3[]=new int[length];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            arr3[count]=arr1[i];
            count++;
        }
        for(int j=0;j<arr2.length;j++){
            arr3[count]=arr2[j];
            count++;
        }
        // for(int k=0;k<arr3.length;k++){
        //     System.out.println(arr3[k]);
        // }
        System.out.println(Arrays.toString(arr3));
    }
}
