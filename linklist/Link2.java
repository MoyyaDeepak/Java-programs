package linklist;
import java.util.LinkedList;

public class Link2 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        l.add("samsung");
        l.add("redmi");
        l.add("oneplus");
        l.add("iqoo");
        l.set(2, "apple");
        l.removeFirst();   /*to remove first element */
        l.removeLast();    /*to remove last element */
        for(String i:l){
            System.out.println(i);
        }
    }
}