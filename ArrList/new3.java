package ArrList;
import java.util.ArrayList;
                                    //ArrayList using for-each
public class new3 {
    public static void main(String[] args) {
        System.out.println("Naruto characters: ");
        ArrayList<String> name=new ArrayList<String>();
        name.add("NARUTO");
        name.add("SASUKE");
        name.add("SAKURA");
        name.add("KAKASHI");
        name.add("ROCK LEE");
        for(String i: name){
            System.out.println(i);
        }
    }
}
