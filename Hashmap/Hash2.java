package Hashmap;
import java.util.HashMap;

public class Hash2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        hm.put("deepak",19);
        hm.put("Dhumps", 22);
        hm.put("none",0);
        System.out.println(hm.get("deepak"));    //only one key value will be displayed
        System.out.println(hm);
    }
}
