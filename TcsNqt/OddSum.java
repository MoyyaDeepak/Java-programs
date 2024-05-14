/*Question: An e-commerce company plans to give their customers a discount for the New Years holiday. The discount will be calculated on the basis
of the bill amount of the order placed. The discount amount is the sum of all the odd valued digits in the customer's total bill amount. If no odd
digit is present in the amount, then the discount will be zero. */

package TcsNqt;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value=s.nextInt();
        int temp, n=0;
        while (value>0) {
            temp=value%10;
            if(temp%2!=0){
                n+=temp;
            }
            value/=10;
        }
        System.out.println("The sum of odd digits value is "+n);
    }
}
