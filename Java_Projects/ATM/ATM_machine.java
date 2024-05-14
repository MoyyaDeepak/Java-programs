package Java_Projects.ATM;

import java.util.Scanner;

public class ATM_machine {
    public void details(){
            System.out.println("WELCOME TO THE BANK OF INDIA");
            System.out.print("Enter account number: ");
            Scanner s=new Scanner(System.in);
            String str=s.next();
            if(str.length()==10){
                System.out.println("------------------------");
            }else
            System.out.println("Account number must contain 10 digits");
            System.out.print("Enter PIN number: ");
            String password=s.next();
            if(password.length()==4){
                System.out.println("------------------------");
            }else
            System.out.println("Incorrect PIN !!!");
        }
    public void methods(int value){
        switch (value) {
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Deposit Amount");
                break;
            case 3:
                System.out.println("Withdraw Amount");
                break;
            case 4:
                System.out.println("Exit");
                break;
        
            default:
                break;
        }
    }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            ATM_machine atm = new ATM_machine();
            atm.details();
            atm.methods(s.nextInt());
        }
    }

