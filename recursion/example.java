package recursion;

public class example {
    // Online Java Compiler
// recursion
    public static void main(String[] args) {
        int a=myMethod(3);
                System.out.println(a);
    }
    static int myMethod(int b){
        if(b>0){
            return b+myMethod(b-1);
        }
        else{
            return 0;
        }
    }
}
