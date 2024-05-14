package Lists;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(21);
        a.add(22);
        a.add(23);
        a.set(2, 4);
        System.out.println(a);
    }
}
