package Gov;
import java.util.*;

import javax.swing.RowFilter.Entry;
import javax.xml.stream.events.EntityReference;

public class G_hmap {
    private static Map<String, Map<String,Integer>>a;
    public static void main(String[] args) {
        a=new HashMap<>();
        int c=0;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of students for reports:");
        int num=s.nextInt();
        while(num>0){
            System.out.println("Enter name of the student:");
            String name=s.next();

            Map<String, Integer> subMap=new HashMap<>();

            System.out.println("Enter english marks:");
            int eng_marks=s.nextInt();
            subMap.put("English", eng_marks);

            System.out.println("Enter hindi marks:");
            int hin_marks=s.nextInt();
            subMap.put("Hindi", hin_marks);

            System.out.println("Enter telugu marks:");
            int tel_marks=s.nextInt();
            subMap.put("Telugu", tel_marks);
            
            System.out.println("Enter Maths marks:");
            int math_marks=s.nextInt();
            subMap.put("Maths", math_marks);
            
            System.out.println("Enter Social marks:");
            int soc_marks=s.nextInt();
            subMap.put("Social", soc_marks);
            
            System.out.println("Enter Science marks:");
            int sci_marks=s.nextInt();
            subMap.put("Science", sci_marks);

            a.put(name, new HashMap<>(subMap));
            num--;
        }
        Set<java.util.Map.Entry<String, Map<String, Integer>>> en=a.entrySet();
        for (java.util.Map.Entry<String, Map<String, Integer>> entry : en) {
            System.out.println(en);
        }
    }
}
