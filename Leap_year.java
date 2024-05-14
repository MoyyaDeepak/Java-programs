import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the Year:");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%100==0 && year%400==0 ||  year%100!=0 && year%4==0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
