package Lists;
import java.util.*;

public class CountRepeatedValues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("baby","ball","soap","baby","shampoo","chalk","soap","makeup","baby","lotion");
        List<String> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int count=1;
            boolean isRepeated=false;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                    isRepeated=true;
                }
            }
            if(isRepeated && !list2.contains(list.get(i))){
                list2.add(list.get(i));
                System.out.println(list.get(i)+" is repeated "+count+" times");
            }
        }
    }
}
