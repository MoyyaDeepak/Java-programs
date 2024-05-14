                package Gov;

public class Two {
    void main(){
    int x=10;
    System.out.println(x++ + ++x);
    System.out.println(++x + x++);
    System.out.println(++x + ++x);
    System.out.println(x);
}
public static void main(String[] args) {
    new Two().main();
}
}
