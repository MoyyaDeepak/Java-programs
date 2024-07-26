package Lists;

import java.util.*;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        LinkedList<Integer> l=new LinkedList<>();
        l.add(4);
        l.add(5);
        l.add(0);
        l.add(9);
        l.add(8);
        l.add(10);
        for(int i:l){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of all even numbers in the list: "+sum);
    }
}
