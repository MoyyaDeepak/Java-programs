package encapsulation;

public class New {
    private String Name;
    private int Age;

    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int age){
        this.Age=age;
    }
    public int getAge(){
        return Age;
    }
    class display{
        public static void main(String[] args) {
            New n=new New();
            n.setName("Naruto");
            n.setAge(20);
            System.out.println(n.getName());
            System.out.println(n.getAge());
        }
    }

}
