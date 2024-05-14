package exceptions;

public class Excep1 {
    public static void main(String[] args) {
        try{
            int i[]={1,2,3};
            System.out.println(i[5]);
        }catch(Exception e){
            System.out.println("Access Denied");
        }
    }
}
