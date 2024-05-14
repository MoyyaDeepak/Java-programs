package Lists;
import java.util.Stack;
import java.util.Vector;
public class Stack_new {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(21);
        s.push(22);
        s.push(23);
    
        System.out.println(s.search(23));
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
    }
}
