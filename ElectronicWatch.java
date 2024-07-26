import java.util.*;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int hours=input/3600;
        int minutes=(input%3600)/60;
        int seconds=input%60;
        hours%=24;
        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
    }
}
