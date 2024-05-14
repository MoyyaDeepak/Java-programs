package inheritance;

public class Two {
        String name="JANU";
        int age=22;
        String looking="TOO CUTE";
    }

class iam extends Two{
        String name2="deepak";
    }

class mySelf extends iam{
    public void myDetails(){
        System.out.println(name +" is "+ age +" she is "+ looking);
    }
}
class Main{
    public static void main(String[] args) {
        mySelf m=new mySelf();
        m.myDetails();
    }
}