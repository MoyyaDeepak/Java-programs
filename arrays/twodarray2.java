package arrays;

public class twodarray2 {
    public static void main(String[] args) {                       //sum of two dimensional arrays
        int [][] arr=new int[3][3]; 
        arr[0][0]=1;
        arr[0][1]=8;
        arr[0][2]=4;
        arr[1][0]=9;
        arr[1][1]=7;
        arr[1][2]=2;
        arr[2][0]=7;
        arr[2][1]=6;
        arr[2][2]=4; 
        int sum=   arr[0][0]+arr[0][1]+arr[0][2]+arr[1][0]+arr[1][1]+arr[1][2]+arr[2][0]+arr[2][1]+arr[2][2]; 
        System.out.println(sum);
    }
}
