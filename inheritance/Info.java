package inheritance;

public class Info {
    String name;
    int age;
    String gender;
}
class Content extends Info{
    void disp(){
        name="Deepak";
        age=20;
        gender =  "Male";
    }
    public static void main(String[] args) {
        Content c=new Content();
        c.disp();
        System.out.println(c.name +"\n "+c.age+"\n "+c.gender);
    }
}
