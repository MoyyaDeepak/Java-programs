package practise;
import java.util.*;

class RemoveDuplicateElements{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        RemoveDuplicateElements r=new RemoveDuplicateElements();
        int k=r.removeDuplicate(arr);
        System.out.println("After the duplicate elements are removed: ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int removeDuplicate(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int k=hs.size();
        int j=0;
        for(int x:hs){
            arr[j++]=x;
        }
        return k;
    }
}