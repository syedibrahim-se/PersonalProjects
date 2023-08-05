package ba;
import java.util.*;
public class BankAccount {
    String customerName;
    String customerId;
    int balance;

   public BankAccount(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }
    Scanner sc=new Scanner(System.in);
    int previousTransaction;
    public void deposite(int amount){
        if(amount !=0 ){
            balance=balance+amount;
            previousTransaction=amount;
        }
    }

   public  void withdraw(int amount){
        if(amount != 0){
            balance=balance-amount;
            previousTransaction=-amount;
        }

    }
    public void getPreviousTransaction(){
        if(previousTransaction >0){
            System.out.println("Amount Deposited:"+previousTransaction);
        }
        else if (previousTransaction <0) {
            System.out.println("Amount Withdraw:"+Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction is occured:");
        }
    }

    public void showMenu(){
        char option ='\0';

        System.out.println("Welcome to Banking Application:"+customerName);
        System.out.println("Your Id is:"+customerId);
        System.out.println("");
        System.out.println("A.CheckBalance:");
        System.out.println("B.Deposite Amount:");
        System.out.println("C.Withdraw Amount:");
        System.out.println("D.Previous Transaction:");
        System.out.println("E.Exit");
        do{
            System.out.println("************************************");
            System.out.println("Enter the Options:");
            System.out.println("************************************");
             option=sc.next().charAt(0);


            switch(option){

                case 'A':
                    System.out.println("********************************");
                    System.out.println("Balance is:"+balance);
                    System.out.println("********************************");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("********************************");
                    System.out.println("Enter Your Deposite Amount:");
                    System.out.println("********************************");
                    int amount =sc.nextInt();
                    deposite(amount);
                    System.out.println("");
                    break;
                case 'C':
                    System.out.println("********************************");
                    System.out.println("Enter Your to Withdraw:");
                    System.out.println("********************************");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("********************************");
                    getPreviousTransaction();
                    System.out.println("********************************");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("********************************");
                    break;
                default:
                    System.out.println("Invalid Option Please Try Again:");
                    break;

            }
        }while(option != 'E');
    }

}

