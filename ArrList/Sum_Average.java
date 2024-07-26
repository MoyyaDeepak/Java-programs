package ArrList;
import java.util.ArrayList;

public class Sum_Average {
    public static void main(String[] args) {
        int sum=0,average=0;
        ArrayList<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(0);
        a.add(9);
        a.add(8);
        a.add(10);
        for(int i:a){
            sum+=i;
        }
        System.out.println("Sum of all the elements: "+sum);
        for(int j:a){
            average=sum/a.size();
        }
        System.out.println("Average of all the elements: "+average);

    }
}
