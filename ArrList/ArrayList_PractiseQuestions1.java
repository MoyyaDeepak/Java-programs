package ArrList;

import java.util.*;

class ArrayList_PractiseQuestions1{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Red");
        a.add("Black");
        a.add("Blue");
        a.add(null);
        a.add("Green");
        a.add("Yellow");
        System.out.println("a elements: "+a);

        ArrayList<String> a2=new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");
        a2.add("d");
        a2.add("e");
        a2.add("f");
        System.out.println("a2 elements: "+a2);

        // Collections.copy(a, a2);
        // System.out.println("After copying a2 into a: ");
        // System.out.println("a elements: "+a);
        // System.out.println("a2 elements: "+a2);

        // Collections.shuffle(a2);
        // System.out.println("After shuffling: "+ a2);

        // Collections.reverse(a);
        // System.out.println("After reversing the a elements: "+a);

        System.out.println(a.subList(0, 3)); //sublist(to extract some portion of elements from the list)

        // System.out.println(a);// before updating

        // a.set(1, "White");

        // System.out.println(a);//after updating
        // a.remove(null);

        // System.out.println(a);//after removing an element

        // if(a.contains("Green"))
        // System.out.println("Found the element"); //finding an element
        // else
        // System.out.println("Not found");

        // Collections.sort(a);
        // System.out.println(a); //after sorting the array 
    }
}