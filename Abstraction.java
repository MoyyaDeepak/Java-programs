abstract class Abstraction {
    public abstract void method();
    public void display(){
        System.out.println("demo");
    }
}
class Demo extends Abstraction{
    public void method(){
        int age=12;
        System.out.println("second demo"+age);
    }
}
class Original{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
        d.method();
    }
}