/*
Daniel Gail
Dec 8, 2014

Chapter 3
Programming Challenge 15
Page 191

Program to calculate check fees based on the number of checks written.
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_15
{
    public static void main (String [] args)
    {
        int checks;
        double total;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter in the number of checks you wrote :");
        checks = input.nextInt();
        
        System.out.println("Be aware there is a $10 a month fee reguardless " +
                    "of the number of checks.");
        
        if (checks < 20)
        {
            total = 10 + (.1 * checks);
            
            System.out.print("The total in checking fees is: $");
            System.out.format("%.2f%n", total);
        }
        
        else if (checks >= 20 && checks <= 39)
        {
            total = 10 + (.08 * checks);
            
            System.out.print("The total in checking fees is: $");
            System.out.format("%.2f%n", total);
        }
        
        else if (checks >= 40 && checks <= 59)
        {
            total = 10 + (.06 * checks);
            
            System.out.print("The total in checking fees is: $");
            System.out.format("%.2f%n", total);
        }
        
        else if (checks >= 60)
        {
            total = 10 + (.04 * checks);
            
            System.out.print("The total in checking fees is: $");
            System.out.format("%.2f%n", total);
        }
        
        else
        {
            System.out.println("Please enter a valid number.");
        }
    }
}