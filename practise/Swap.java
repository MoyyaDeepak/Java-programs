package practise;

public class Swap {
    public static void main(String[] args) {
        int a=2,b=9,swap;
        System.out.println("Before swapping: "+a+" "+b);
        swap=a;
        a=b;
        b=swap;
        System.out.println("After swapping: "+a+" "+b);

        /*
        a=a+b; 2+9=11
        b=a-b; 11-9=2
        a=a-b; 11-2=9      swapping without using third variable
        */
    }
}
