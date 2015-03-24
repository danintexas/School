/*
Daniel Gail
March 23, 2015

COSC 1437
Assignment #6
 */

import java.text.DecimalFormat;

/**
 * Every bank also offers a SavingsAccount. This class extends the 
 * BankAccount class. The savings account customer typically receives 
 * interest, makes deposits and withdraws money.
 * This class should provide the following methods:
 *      set/retrieve interest rates (2 separate methods)
 *      post interest
 *      withdraw (override the base)
 *      Print account information
 *      Add appropriate constructors. 
 */

public class SavingsAccount extends BankAccount
{
    protected static double interestRate;    
    protected static double interestEarned;
    
    DecimalFormat dollar = 
                new DecimalFormat("#,###.00");

    // Account and Balance data sent to the BankAccount superclass
    public SavingsAccount (int account, double balance)
    {
        super (account, balance);
    }
    
    // Method to set the interest rate
    public void setInterest()
    {
        interestRate = .03;
        System.out.println("Program has set the interest rate " +
                "for Savings Account #" + accountNumber +
                " to " + interestRate + "%");
    }
    
    // Method to return the interest rate
    public double getInterest()
    {
        return interestRate;
    }
    
    // Post the interest to the account
    public void postInterest()
    {
        interestEarned = (accountBalance * interestRate);
        
        System.out.print("Your current account balance is: $" +
                dollar.format(accountBalance) +
                ".\nThe amount of interest earned this month is: $" +
                dollar.format(interestEarned) +
                ".\nYour new account total is: $");
        accountBalance += interestEarned;
        
        System.out.print(dollar.format(accountBalance));  
    }
    
    // Withdraw method
    public void withdraw (double amount)
    {
        accountBalance -= amount;
        
        System.out.println("New Savings Account balance is $" +
                dollar.format(accountBalance));
    }
    
    // toString section
    public String toString()
    {
        return "Account Number: " + accountNumber +
                "\nCurrent Balance: $" + 
                dollar.format(accountBalance);
    }
}
