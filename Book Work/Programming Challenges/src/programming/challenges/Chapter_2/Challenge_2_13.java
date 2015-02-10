/////////////////////////////////////////////////////////////////////
//Daniel Gail
//Sept 24, 2014
//Chapter 2 Challenge 13
//
//Program works up a sample resturant bill. 
//Take in the total of the bill as input.
//Adds the tax of 6.75 percent
//Adds a 15 percent tip
//Displays all above to the screen
/////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_13
{
   public static void main (String [] args)
   {
   
   Scanner input = new Scanner (System.in); // Sets up for input
   
   double bill, tax = .0675, tip = .15, total;
   
   System.out.print("Please enter in the total of your bill: ");
   bill = input.nextDouble();
   
   total = bill + (bill * tax) + ((bill + (bill * tax)) * tip);
   
   System.out.print("\n\nBill: $" + bill);
   System.out.print("\nTax: $");
   System.out.format("%.2f%n", (bill * tax));
   System.out.print("Tip: $");
   System.out.format("%.2f%n", ((bill + (bill * tax)) * tip));
   System.out.print("\nThe total of your bill is: ");
   System.out.format("%.2f%n", total);   
   }
}