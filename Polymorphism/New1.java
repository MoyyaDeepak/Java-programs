package Polymorphism;
                                         //example1
public class New1 {
    void method(){
        int a=9,b=10;
        int c=a+b;
        System.out.println(c);
    }
    void method(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    void method(int x,double y){
        double z=x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        New1 n=new New1();
        n.method(21, 26);n.method(11, 23.34); n.method();
}
}