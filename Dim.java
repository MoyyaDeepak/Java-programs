public class Dim {
    static int meth1(int i, String string){
        int e=21;
        return e;
    }
    static int meth2(){
        int a =12;
        return a;
    }
    static String meth3(){
        String b="c";
        return b;
    }
    public static void main(String[] args) {
        Dim d=new Dim();
        int x=d.meth2();
        String s=d.meth3();
        int i=new Dim().meth1(d.meth2(),d.meth3());
        System.out.println(i+x);
        System.out.println(s);
    }
}
