package inheritance.com;

public class Twoo extends onee{
    public void details(){
        int roll_no=21;
        String gender="Male";
        System.out.println("Roll No: "+roll_no +"\n"+"Gender: "+gender);
    }
    public static void main(String[] args) {
        Twoo t=new Twoo();
        t.dee();
        t.details();
    }
}
