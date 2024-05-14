package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Exa {
    public static void main(String[] args) {
        Map<Integer, String> m=new HashMap<>();
        m.put(10, "a");
        m.put(11, "b");
        m.put(12, "c");
        m.put(13, "d");
        Set<Integer> s=m.keySet();
        System.out.println(s);
        for(Entry<Integer, String> i:m.entrySet()){
            System.out.println(i);
        }

    }
}
