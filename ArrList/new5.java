package ArrList;
import java.util.ArrayList;
import java.util.Collections;

public class new5 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<Integer>();
        i.add(77);
        i.add(43);
        i.add(47);
        i.add(7);
        Collections.sort(i);
        for(int j=0;j<i.size();j++){
            System.out.println(i.get(j));
        }
    }
}
