package encapsulation;

import java.util.Scanner;
                                      //printing odd or even using encapsulation
public class Example3 {
    private int num;

    public int getNum(){
        if(num%2==0){
            System.out.println(num+" is even");
        }else
        System.out.println(num+" is odd");
        return 0;
    }

    public int setNum(int newNum){
        return num=newNum;
    }
}
class Third{
    public static void main(String[] args) {
        Example3 ex=new Example3();
        ex.setNum(26);
        System.out.println(ex.getNum());
    }
}
