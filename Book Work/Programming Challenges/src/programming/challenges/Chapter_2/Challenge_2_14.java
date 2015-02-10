////////////////////////////////////////////////////////////////////////////
// Daniel Gail
// Sept 24, 2014
// Chapter 2 Challenge 14
//
// Program to calculate the amount of commision paid on stock. 
// Input the value of the stock
// Output the value of the stock, the commision paid (2%), total paid
////////////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_14
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      double baseCost, commissionPaid, totalCost;
      
      System.out.print("Please enter the cost of the stock: $");
      baseCost = input.nextDouble();
      
      commissionPaid = baseCost * .02;
      totalCost = baseCost + commissionPaid;
      
      System.out.print("\n\nThe amount of commission that was paid was: $");
      System.out.format("%.2f%n", commissionPaid);
      System.out.print("\nThe total cost of this purchase was: $");
      System.out.format("%.2f%n", totalCost);      
   }
}