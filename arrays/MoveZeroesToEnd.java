package arrays;
import java.util.*;

public class MoveZeroesToEnd{
        public static void main(String[] args) {
            int nums[]={0,1,0,4,5};
            int j=0;
            int temp[]=new int[nums.length];
            int k=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    temp[k-1]=nums[i];
                    k--;
                }else
                temp[j++]=nums[i];
            }
            System.out.print(Arrays.toString(temp));
        }
}
