package exceptions;

public class Excep2 {
    public static void main(String[] args) {
        try{
            int[] n={2,3,4};
            System.out.println(n[7]);
        }catch(Exception e){
            System.out.println("Access Denied");
        }finally{
            System.out.println("for checking");
        }
    }
}
