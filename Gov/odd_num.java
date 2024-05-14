package Gov;

public class odd_num {
    public static void main(String[] args) {
        
        int sum=0,n=10;
        for(int i=1,count=0;count<n;i+=2){
            System.out.print(i+" ");
            sum+=i;
            count++;
        }
        System.out.println(sum);
    }
}
