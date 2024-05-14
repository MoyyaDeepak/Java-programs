package exceptions;

public class Excep3 {
    static void myAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied - age is below 18");
        }else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        myAge(17);
    }
}
