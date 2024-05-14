package assignments;

public class usingwhile4 {
    public static void main(String[] args) {    //printing 200 to 25 odd numbers using while loop in reverse order
        int i=200;
        while(i>=25){
            if(i%2==1){
            System.out.println(i);
            }
            i--;
        }
    }
}
