import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        String s[]=new String[a];
        System.out.println("enter the element");
        for(int i=0;i<s.length;i++){
            s[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(s));
    }
}
