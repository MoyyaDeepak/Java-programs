package practise;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 4};
        int largest=0, SecondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        System.out.println("The second largest element is "+SecondLargest);
        //System.out.println(largest);
    }
}
