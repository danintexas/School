/*
Daniel Gail
Spet 23, 2014
Chapter 2 Challenge 08

Program is to take a purchase amount from the user and add both the county (2%) and state (4%)
sales tax - display all three back to the user and the total amount due. 

For added fun do this using java windows
*/

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_08
{
   public static void main (String [] args)
   {
      // Set up the variables and literals needed
      double item, county = .02, state = .04, total, countyTax, stateTax;
      
      Scanner keyboard = new Scanner(System.in);
      
      // Request the purchase price
      System.out.print("What was the purchase price: ");  
      item = keyboard.nextDouble();
      
      countyTax = item * county;
      stateTax = item * state;
      
      System.out.print("County tax on this purchas is: ");
      System.out.printf("%1$.2f", countyTax);
      
      System.out.print("\n\nState tax on this purchase is: ");
      System.out.printf("%1$.2f", stateTax);
      
      total = item + countyTax + stateTax;
      
      System.out.print("\n\nThe total for this purchase is: ");
      System.out.printf("%1$.2f", total);
      
   }
}       