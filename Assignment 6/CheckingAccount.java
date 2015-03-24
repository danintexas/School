/*
Daniel Gail
March 23, 2015

COSC 1437
Assignment #6
 */

import java.text.DecimalFormat;

/**
 * Every bank offers a CheckingAccount.  The class should be extended 
 * from the BankAccount class.  The class will inherit members to 
 * store the account number and balance from the superclass.  A 
 * customer with a checking account usually receives interest, 
 * maintains a minimum balance, and pays service charges if the 
 * balance falls below a minimum balance. Add variables to hold the 
 * additional information.  In addition to the inherited methods, the 
 * class should provide the following methods:
 *      set/retrieve interest rate (2 separate methods)
 *      set/retrieve minimum balance
 *      set/retrieve service charges
 *      verify if the balance is less than the minimum balance
 *      write a check
 *      withdraw (overrides the superclass)
 *      print account information
 *      Add appropriate constructors
 */

public class CheckingAccount extends BankAccount
{
    protected static double interestRate;
    protected static double minimum;
    protected static double serviceCharge;
    
    DecimalFormat dollar = 
                new DecimalFormat("#,###.00");
    
    // Account and Balance data sent to the BankAccount superclass
    public CheckingAccount(int account, double balance)
    {
        super (account, balance);
    }
    
    // Method to set the interest rate
    public void setInterest()
    {
        interestRate = .01;
        System.out.println("Program has set the interest rate " +
                "for Account #" + accountNumber +
                " to " + interestRate + "%");
    }
    
    // Method to return the interest rate
    public double getInterest()
    {
        return interestRate;
    }
    
    // Method to set the minimum balance on the account
    public void setMinimum()
    {
        minimum = 100.00;
        System.out.println("Program has set the minimum account balance " +
                "needed for Account #" + accountNumber +
                " to $" + dollar.format(minimum));
    }
    
    // Method to return the minimum balance
    public double getMinimum()
    {
        return minimum;
    }
    
    // Setter for the Service Charge on an account
    public void setServiceCharge()
    {
        serviceCharge = 10.00;
        System.out.println("Program has set the service charge rate " +
                "for Account #" + accountNumber +
                " to $" + dollar.format(minimum));
    }
    
    // Method to return the current service charge
    public double getServiceCharge()
    {
        return serviceCharge;
    }
    
    // Balance checker and charge a service fee if needed
    public void chargeService(double account)
    {
        if (accountBalance < minimum)
        {
            accountBalance -= serviceCharge;
            System.out.println("Your account is below the $" +
                    dollar.format(minimum) + " minimum.\n" +
                    "Your account has been charged $" + 
                    dollar.format(serviceCharge) + 
                    ".\nYour new account balance is $" +
                    dollar.format(accountBalance));
        }
    }
    
    // Method to write a check and subtract it from the balance
    // Also prints out the total after the check is written
    public void writeCheck(int number, double check)
    {
        accountBalance -= check;
        
        System.out.println("\nCheck Number: " + number +
                " was written for: $" + dollar.format(check) +
                "\nWhich leaves the balance at: $" +
                dollar.format(accountBalance));
    }
    
    // Withdraws cash from the account
    public void withdraw (double amount)
    {
        accountBalance -= amount;
    }
    
    // toString section
    public String toString()
    {
        return "Account Number: " + accountNumber +
                "\nCurrent Balance: $" + 
                dollar.format(accountBalance);
    }
}
