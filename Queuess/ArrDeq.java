package Queuess;

import java.util.ArrayDeque;

public class ArrDeq {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.offerLast("null");
        ad.addFirst("name");
        ad.add("me");
        ad.offer("lop");
        ad.addLast("mine");
        ad.offer("offer");
        System.out.println(ad);
    }
}
