package ArrList;
import java.util.ArrayList;
import java.util.Collections;
                                       //ArrayList using sort(collections)
public class new4 {
    public static void main(String[] args) {
        System.out.println("Demon slayer characters: ");
        ArrayList<String> ds=new ArrayList<String>();
        ds.add("TANJIRO KAMADO");
        ds.add("ZENITSU & NEZUKO");
        ds.add("INOSUKE");
        ds.add("RENGOKU & AKAZA");
        ds.add("MUZAN KIBUTSUGHI");
        Collections.sort(ds);
        //System.out.println(ds);
        for(String i:ds){
            System.out.println(i);
        }
    }
}
