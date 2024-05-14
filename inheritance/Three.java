package inheritance;

public class Three {                                 //Multi-Level Inheritance
    public void Add(){
        int a=21; int b=26;
        int c=a+b;
        System.out.println("Sum is: "+c);
    }
    public void Sub(){
        int a=200; int b=100;
        int c=a-b;
        System.out.println("Sub is: "+c);
    }
}
class another extends Three{
    public void Mul(){
        int a=2; int b=1;
        int c=a*b;
        System.out.println("Mul is: "+c);
    }
    public void Div(){
        int a=20; int b=10;
        int c=a/b;
        System.out.println("Div is: "+c);
    }
}
class inkoti extends another{
    public void Rem(){
        int a=20; int b=10;
        int c=a%b;
        System.out.println("Remainder is: "+c);
    }
}
class Program{
    public static void main(String[] args) {
        inkoti i=new inkoti();
        i.Add();i.Sub();i.Mul();i.Div();
        i.Rem();
    }
}