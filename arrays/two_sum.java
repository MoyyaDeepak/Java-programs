package arrays;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] num={1,2,5,9};
        int target=6;
        for(int i=0;i<num.length;i++){
            for(int j=1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    System.out.println("The numbers are "+i+" and " +j);
                }
            }
        }
    }
}
