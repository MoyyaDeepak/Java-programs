package linklist;
import java.util.LinkedList;

public class Link1 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        l.add("pepsi");
        l.add("frooti");
        l.add("coke");
        l.add("maaza");
        l.addFirst("sprite");  /*to add an element first */
        l.addLast("fanta");    /*to add an element last */
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
