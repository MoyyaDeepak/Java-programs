package encapsulation;

public class Example1 {
    private int age;

    public int getAge(){
        return age;
    }
    public int setAge(int newAge){
       return age=newAge;
    }
}
class Second{
    public static void main(String[] args) {
        Example1 ex=new Example1();
       ex.setAge(20);
        System.out.println(ex.getAge());
    }
}
