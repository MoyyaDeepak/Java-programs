package Lists;
import java.util.*;

public class MergeTwoLists {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(9);
        al2.add(8);
        al2.add(10);

        ArrayList<Integer> al3=new ArrayList<>();
        al3.addAll(al);
        al3.addAll(al2);
        System.out.println(al3);
    }
}
