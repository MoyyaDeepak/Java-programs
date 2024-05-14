package string;

public class strass6 {
    public static void main(String[] args) {
        String s1="DeePaK21";                                         //to find no. of upper,lower,num in a string
        int upper=0,lower=0,num=0;                                          
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='A' && ch<='Z')
            upper++;
            if(ch>='a' && ch<='z')
            lower++;
            if(ch>=48 && ch<=57)
            num++;
        }
        System.out.println("no. of upper case letters="+upper);
        System.out.println("no. of lower case letters="+lower);
        System.out.println("no. of lower case letters="+num);

    }
}