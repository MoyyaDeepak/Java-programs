package practise;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=Integer.parseInt(s.nextLine());
        while(t>0){
            String pattern=s.nextLine();
            try{
                Pattern p=Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            t--;
        }
    }
}
