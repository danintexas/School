/*
Daniel Gail
March 23, 2015

COSC 1437
Assignment #6
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Class is set to demonstrate the BankAccount class.
 */

public class BankAccountDemo 
{
    public static void main(String[] args)
    {
       
        Scanner keyboard = new Scanner(System.in);  // user input
        int input;          // int type input
        int number;         // Check number
        int selection = 0;  // counter for my do/while loop
        int account;        // Account number
        double balance;     // Starting account balance
        double money;       // Money placeholder
        
        DecimalFormat dollar = 
                new DecimalFormat("#,###.00");
                
        // Set up the start of the account. 
        System.out.println("First we need to find " +
                "out what kind of account this is.\n(SELECT ONE)" +
                "\n1)Checking " + "\n2)Savings");
        input = keyboard.nextInt();
        System.out.println();
        
        ///////////////////////////////////////////////////////////////
        // If user selects Checking Account
        if (input == 1)
        {
            System.out.println("Please enter in your account number: ");
            account = keyboard.nextInt();
            
            System.out.print("Please enter in your starting " +
                    "account balance: $");
            balance = keyboard.nextDouble();
            
            // Creating that new object we all love with OO progrograming
            CheckingAccount checking =
               new CheckingAccount(account, balance);
            
            System.out.println();
            
            // Using all the set methods.
            // Should be noted that I just added simple print lines
            // in each method in the CheckingAccount class to show
            // I am pinging those methods. 
            // Had I not been behind on time I would of loved to add
            // an 'admin' login to adjust these variables through
            // user input after a password was entered. Not to hard. 
            // But real life just got in the way the last two weeks. 
            // Enough of my life story - ON WITH THE SHOW!
            checking.setMinimum();
            checking.setInterest();
            checking.setServiceCharge();
            System.out.println();
            
            //
            do  // Set up as a do/while since it will run at least once
            {
                System.out.println("Please make a selection from the " 
                        + "below:");
                System.out.print("1) Get Interest Rate\n" +
                        "2) See minimum Balance and Service Charge\n" +
                        "3) Write a Check\n" +
                        "4) Withdraw cash\n" +
                        "5) Deposit\n" +
                        "6) Account Summary\n" +
                        "7) Exit\n");
                selection = keyboard.nextInt();
                System.out.println();
                
                // Calls the interestRate from CheckingAccount.java
                if (selection == 1)
                    System.out.println("The current interest rate for " +
                            "our checking accounts is " + 
                            checking.interestRate + "%");
                
                // Calls getMinimum and getServiceCharge from
                // CheckingAccount
                else if (selection == 2)
                {
                    System.out.println("The minimum amount you need " +
                            "to maintain in your checking account " +
                            "is $" + checking.getMinimum());
                    System.out.println("If you go below this amount " +
                            "you will incure a $" + 
                            checking.getServiceCharge() + " fee.");
                }
                
                // User enters in a check to withdraw with check number
                // This calls to the writeCheck and chargeService 
                // methods of the CheckingAccount class
                else if (selection == 3)
                {
                    System.out.print("Please enter in the check " +
                            "number to process: ");
                    number = keyboard.nextInt();
                    
                    System.out.print("Please enter in the amount of " +
                            "the check: $");
                    money = keyboard.nextDouble();
                                        
                    checking.writeCheck(number, money);
                    checking.chargeService(checking.getBalance());
                }
                
                // Withdraws cash from the Checking account
                // calls to the withdraw method in the CheckingAccount
                else if (selection == 4)
                {
                    System.out.print("Please enter in the amount to " +
                            "withdraw: $");
                    money = keyboard.nextDouble();
                    checking.withdraw(money);
                    System.out.println("New balance is $" + 
                            dollar.format(checking.getBalance()));
                    checking.chargeService(checking.getBalance());  
                }   
                
                // This calls to the getBalance and deposit methods in 
                // the super class BankAccount.java
                else if (selection == 5)
                {
                    System.out.print("Please enter in the amount to " +
                            "deposit: $");
                    money = keyboard.nextDouble();
                    checking.deposit(money);
                    System.out.println("New balance is $" + 
                            dollar.format(checking.getBalance()));
                }   
                
                // Uses the toString call from CheckingAccount.java
                else if (selection == 6)
                    System.out.println(checking);
            } while (selection != 7);
            
            // Call to get the Checking Interest method
            System.out.println("If your current balance of $" +
                    dollar.format(checking.getBalance()) + 
                    " stays the same\nthrough the month then " +
                    "you will collect $" +
                    dollar.format((checking.getBalance() * 
                            checking.getInterest())) +
                    " in interest.");
            System.out.println("\nThank you for banking with us!");
            
            System.exit(0); // Terminates the application
        }
        
        ///////////////////////////////////////////////////////////////
        // If user selects Savings Account
        if (input == 2)
        {
            System.out.println("Please enter in your account number: ");
            account = keyboard.nextInt();
            
            System.out.print("Please enter in your starting " +
                    "account balance: $");
            balance = keyboard.nextDouble();
            
            // Creating that new object of the SavingsAccount type
            SavingsAccount saving =
               new SavingsAccount(account, balance);
            System.out.println();
            
            saving.setInterest();
            System.out.println();
            
            do
            {
                System.out.println("\nPlease make a selection from the " 
                        + "below:");
                System.out.print("1) Get Interest Rate\n" +
                        "2) Post Interest for the month\n" +
                        "3) Withdraw \n" +
                        "4) Deposit\n" +
                        "5) Account Summary\n" +
                        "6) Exit\n");
                selection = keyboard.nextInt();
                System.out.println();
                
                // Calls the interestRate method from SavingsAccount
                if (selection == 1)
                    System.out.println("The current interest rate for " +
                            "our savings accounts is " + 
                            saving.interestRate + "%\n");
                
                // Calls the postInterest method from SavingsAccount
                else if (selection == 2)
                    saving.postInterest();
                
                // Calls the withdraw method from SavingsAccount
                else if (selection == 3)
                {
                    System.out.print("Please enter in the amount to " +
                            "withdraw: $");
                    money = keyboard.nextDouble();
                    saving.withdraw(money);
                }
                
                // Calls the deposit method from the BankAccount class
                else if (selection == 4)
                {
                    
                    System.out.print("Please enter in the amount to " +
                            "deposit: $");
                    money = keyboard.nextDouble();
                    saving.deposit(money);
                    System.out.println("New balance is $" + 
                            dollar.format(saving.getBalance()));   
                }
                
                // Uses the toString call from SavingsAccount
                else if (selection == 5)
                    System.out.println(saving);
            } while (selection != 6);
            
            System.out.println("Your current Savings Account Balance " +
                    "is $" + dollar.format(saving.getBalance()));
            System.out.println("\nThank you for banking with us!");
            
            System.exit(0); // Terminates the application
        }
        
        ///////////////////////////////////////////////////////////////
        // If the user selects an invalid option the application ends
        else 
            System.out.println("\nSorry that selection is not " +
                    "a valid one.\nPlease rerun this application.");
    }
}