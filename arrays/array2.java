package arrays;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
       String s1[]={"milk","tea"},s2[]={"coffee"};
       int length=s1.length+s2.length;
        String s3[]=new String[length];
        int count=0;
        for(int i=0;i<s1.length;i++){
            s3[count]=s1[i];
            count++;
        }
        for(int j=0;j<s2.length;j++){
            s3[count]=s2[j];
            count++;
        }
        System.out.println(Arrays.toString(s3));
    }
}
