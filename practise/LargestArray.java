package practise;

public class LargestArray {
    public static void main(String[] args) {
        int arr[]={1,3,89,4,67};
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("The maximum number is "+max);
    }
}
