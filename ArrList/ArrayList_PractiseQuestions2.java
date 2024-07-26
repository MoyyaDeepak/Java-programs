package ArrList;
import java.util.*;

public class ArrayList_PractiseQuestions2 {
    public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Mango");

      ArrayList<String> list4=new ArrayList<>();
      list4.add("A");
      list4.add("B");
      list4.add("C");
      list4.add("D");

      ArrayList<String> list=new ArrayList<>();      //Adding Two array lists
      list.addAll(list1);
      list.addAll(list4);
      System.out.println(list);

      list1.trimToSize();   //used to trim the array list
      list1.ensureCapacity(6);   //to increase the capacity of the array list
      list1.set(2, "Pineapple");
      System.out.println("After replacing one element: "+list1);

    /*  ArrayList<String> list2=new ArrayList<>();
        list2.add("Apple");
        list2.add("Pine Apple");
        list2.add("Orange");
        list2.add("Mango");

        ArrayList<String> list3=new ArrayList<>();
        for(String s:list1)
        list3.add(list2.contains(s)? "Yes": "No");
        System.out.println(list3);   */



    }
}
