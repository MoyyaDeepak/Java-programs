package Lists;
import java.util.*;

public class HighestNumberOfDuplicates {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6);
        List<Integer> l2=new ArrayList<>();

        for(int i=0;i<l.size();i++){
            int count=1;
            boolean isRepeated=false;
            for(int j=i+1;j<l.size();j++){
                if(l.get(i).equals(l.get(j))){
                    count++;
                    isRepeated=true;
                }
            }
            if(isRepeated && !l2.contains(l.get(i))){
                l2.add(l.get(i));
                System.out.println(l.get(i)+" is the most repeated value "+count);
            }
        }
    }
}
