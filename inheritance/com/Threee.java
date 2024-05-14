package inheritance.com;

public class Threee extends Twoo{
    public void address(){
        String ad="Plot no: 111, Sri sudha estate, Kothavalasa";
        System.out.println("Address: "+ad);
    }
    public static void main(String[] args) {
        Threee th=new Threee();
        th.dee();
        th.details();
        th.address();
    }
}
