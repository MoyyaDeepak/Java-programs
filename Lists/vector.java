package Lists;
import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        Vector v1=new Vector();
        v.add("v");
        // v.add(v1.get(0))
        v.add("deepak");
        v.add("naruto");
        v.add(0,"madara");
        v.add("hashirama");
        v.add("kakashi");
        v.add("v");
        v1.add("deepak");
        v1.add("naruto");
        v1.add("madara");
        v1.add("hashirama");
        v1.add("kakashi");
        for(int i=0;i<v1.size();i++){
            v.add(v1.get(i));
        }
        // System.out.println(v.contains("deepak"));
        v.set(0, "Jiraya Sensei");           //it'll update the 0th index with the new value
        System.out.println(v);
        // System.out.println(v.containsAll(v1));
        System.out.println("size:"+ v.size());
        System.out.println("capacity: "+v.capacity());
    }
}
