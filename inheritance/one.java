package inheritance;
                              //single level inheritance
public class one {
    int num=21;
    String name;
}
class me extends one{
    void disp(){
        name="deepak";
        System.out.println(num+" "+name);
    }
    public static void main(String[] args) {
        me d=new me();
        d.disp();
    }
}
