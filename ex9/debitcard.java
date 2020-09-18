/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class debitcard {
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter account number:");
        String no=obj.next();
        System.out.println("Enter accounter name:");
        String name=obj.next();
        System.out.println("Enter amount to deposit:");
        double deposit=obj.nextDouble();
        System.out.println("Enter amount to withdraw:");
        double withdraw=obj.nextDouble();
        System.out.println("\nACCOUNT DETAILS\n");
        bankaccount b=new bankaccount(name,no);
        b.getno();
        b.getname();
        b.deposit(deposit);
         try
        {
           b.withdraw(withdraw); 
        }
        catch(AmountLimitException e)
        {
            System.out.println("Exception:"+e.getMessage());
        }
        //b.withdraw(withdraw);
        
        b.getbalance();
        
    }
}

class bankaccount
{
    double balance=0;
    String name;
    String accno;
    bankaccount(String n,String a)
    {
        name=n;
        accno=a;
    }
    
    void getbalance()
    {
       System.out.println("\nBalance is:"+balance);
    }
    
    void getno()
    {
       System.out.println("\nAccount number is:"+accno);
    }
    
    void getname()
    {
        System.out.println("\nName of the accounter is:"+name);
    }
    
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("\nDeposited amount is:"+amount);
        System.out.println("\n"+name+" has $"+balance);
    }

    void withdraw(double amount) throws AmountLimitException
    {
        if(amount<balance)
        {
            balance=balance-amount;
            System.out.println("\nAfter withdrawel:");
            System.out.println("\n"+name+" has $"+balance);
            System.out.println("\nWithdraw amount is:"+amount);
        }
        else
        {
           System.out.println("\nERROR:Withdrawel amount should be lesser than balance amount"); 
        }
    }
}

class AmountLimitException extends Exception
{
    AmountLimitException(String msg)
    {
        super(msg);
    }
}
    
   
