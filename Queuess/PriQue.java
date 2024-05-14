package Queuess;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pq.offer(n);
        pq.add(21);
        pq.add(58);
        pq.offer(35);
        System.out.println("Size of the Queue is: "+pq.size());
        System.out.println(pq);
        pq.clear();
        System.out.println(pq);
    }
}
