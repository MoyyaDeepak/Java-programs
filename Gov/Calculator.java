package Gov;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        System.out.println("Enter the operator you want to use: +,-,*,/,%");
        char op=s.next().charAt(0);
        switch (op) {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            case '/':System.out.println(a/b);
            break;
        
            default:System.out.println("Invalid Operator");
                break;
        }
    }
}
