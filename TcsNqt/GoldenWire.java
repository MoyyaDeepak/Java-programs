package TcsNqt;
import java.util.Arrays;
public class GoldenWire {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,7};
        int max=0;
        int length=arr.length;
        
        while(length>1){
            Arrays.sort(arr);
            int sum=arr[0]+arr[1];
            max+=sum;
            arr[0]=sum;
            arr[1]=Integer.MIN_VALUE;
            length--;
        }
        System.out.println(max);
    }
}
