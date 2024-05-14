package Hashset;
import java.util.HashSet;

public class Hset2 {
    public static void main(String[] args) {
        HashSet<String> h= new HashSet<String>();
            h.add("Me");
            h.add("YOU");
            h.add("we");
            h.add("Me");
            h.add("us");
            System.out.println(h.contains("us"));    //prints true 
    }
}
