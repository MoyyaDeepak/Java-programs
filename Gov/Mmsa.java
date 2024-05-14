package Gov;

import java.util.Scanner;

public class Mmsa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int count=0;
        int min=10;
        int max=10;                           //To find sum, average, minimum, maximum
        for(int i=10;i<=n;i+=10){
            sum+=i;
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
            System.out.print(i+" ");
            count++;
        }
        float avg=sum/count;
        System.out.println("\n"+"Sum of the given numbers: "+sum);
        System.out.println("Average of the given numbers: "+avg);
        System.err.println("Maximum of the given numbers: "+max);
        System.out.println("Minimum of the given numbers: "+min);
        
    }
}
