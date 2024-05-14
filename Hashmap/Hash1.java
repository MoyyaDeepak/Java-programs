package Hashmap;
import java.util.HashMap;

public class Hash1 {
    public static void main(String[] args) {
        HashMap<String, String> h=new HashMap<String, String>();
        h.put("Telengana","Hyderabad");
        h.put("Maharastra","Mumbai");
        h.put("Kerala", "Bengaluru");
        h.put("AndhraPradesh", "error!NotFound");
        for(String i:h.keySet()){
        System.out.println("key: "+ i +" value: "+ h.get(i));
        }
    }
}
