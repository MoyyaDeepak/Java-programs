             /*program the check whether the given numbers are present in the set or not using "contain" method */
package Hashset;
import java.util.HashSet;
                                    
public class Hset3 {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<Integer>();
        num.add(3);
        num.add(7);
        num.add(1);
        for(int i=1;i<=10;i++){
            if(num.contains(i))
                System.out.println(i+" is present in the set");
            else{
                System.out.println(i+" is not present in the set");
            }
        }
    }
}
