package TcsNqt;

import java.util.Scanner;

public class NumberOfSundays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day: ");
        String day=sc.nextLine();
        System.out.println("Enter the number of days: ");
        int numDays=sc.nextInt();
        String arr[]={"mon", "tue", "wed", "thur", "fri", "sat", "sun"};
        for(int i=0;i<arr.length;i++)
            if(arr[i]==day)
                break;
            int result=1;
            int rem=6-1;                  //not a right code
            numDays=numDays-rem;
            if(numDays>0)
                result=result+(numDays/7);
            System.out.println(result);
    }
}
