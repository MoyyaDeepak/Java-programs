package arrays;
import java.util.*;

public class ReverseByKnumbers {
    public static void Reverse(int arr[], int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void reverseLeft(int arr[], int n, int k){
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n-1);
        Reverse(arr, 0, n-1);
    }
	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5, 6, 7};
		int k=3, n=arr.length;
		reverseLeft(arr, n, k);
		System.out.println(Arrays.toString(arr));
	}
}
