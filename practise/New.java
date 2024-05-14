package practise;
import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
        int arr[]={1,4,5,6};
        int product=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                product=arr[i]*arr[j+1];

            }
        }
    }
}
