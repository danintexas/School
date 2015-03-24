/*
Daniel Gail
March 23, 2015

COSC 1437
Assignment #6
*/

/**
 * Design an abstract class called BankAccount. The account should 
 * store the balance and account number of the customer. Suppose 
 * that account number is of the type int and the balance is of the 
 * type double. Your class should, at least, provide the following 
 * operations:
 *      set account number
 *      retrieve account number
 *      retrieve balance
 *      deposit and withdraw money
 *      print account information. Add appropriate constructors
 */

public abstract class BankAccount 
{
    protected int accountNumber;      // Account number
    protected double accountBalance;   // Account balance
   
    // Constructor 
    public BankAccount (int account, double balance)
    {
        accountNumber = account;
        accountBalance = balance;
    }
    
    // Method to set the account number
    public void setAccount(int account)
    {
        accountNumber = account;
    }
    
    // method to retrieve the account number
    public int getAccount()
    {
        return accountNumber;
    }
    
    // method to retrieve the account balanace
    public double getBalance()
    {
        return accountBalance;
    }
    
    // Method to deposit funds
    public void deposit (double amount)
    {
        accountBalance += amount;   
    }
    
    // Method to withdraw funds
    public void withdraw (double amount)
    {
        accountBalance -= amount;
    }
    
    // method to print out the account information
    public String toString()
    {
        return "Account Number: " + accountNumber +
                "\nCurrent Balance: " + accountBalance;
    }
}
