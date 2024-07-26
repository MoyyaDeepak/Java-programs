package Lists;
import java.util.*;

public class Split_list {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(10);
        ArrayList<Integer> half1=new ArrayList<>();
        ArrayList<Integer> half2=new ArrayList<>(); 
        for(int i=0;i<al.size()/2;i++){
            half1.add(al.get(i));
        }
        for(int i=al.size()/2;i<al.size();i++){
            half2.add(al.get(i));
        }
        System.out.println(half1);
        System.out.println(half2);
    }
}
