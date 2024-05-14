package encapsulation;

public class Example2 {
    private int age;
    private String name;
    
public String getName(){
    return name;
}
public void setName(String newName){
    this.name=newName;
}
public int getAge(){
    return age;
}
public int setAge(int newAge){
    return this.age=newAge;
}
}
class Main{
    public static void main(String[] args){
        Example2 h=new Example2();
        h.setName("Deepak");
        h.setAge(19);
        System.out.println("name: "+h.getName());
        System.out.println("age: "+h.getAge());
    }
}