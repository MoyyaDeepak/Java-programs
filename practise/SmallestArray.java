package practise;

public class SmallestArray {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,6};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.println("Smallest number: "+min);
    }
}
