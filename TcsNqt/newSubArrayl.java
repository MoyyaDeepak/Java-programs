package TcsNqt;

public class newSubArrayl {
    public static void subarray(int arr[]){
        int i=0,j=1;
        int max=0;
        while(i<arr.length-1 && j<arr.length){
            System.out.println(arr[i]  + " " + arr[j]);
            int sum=arr[i]+arr[j];
            max=Math.max(max, sum);
            i++;
            j++;
            
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        subarray(n);
        
    }
}
