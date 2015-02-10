/////////////////////////////////////////////////////////////////////////////////
//Daniel Gail
//Sept 24, 2014
//Chapter 2 Challenege 11
//
//Calulate the profit of making a circuit board. Take in the retail price of the
//circuit board and calculate the profit of each board.
//Profit = Retail price x 0.4
/////////////////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_11
{
   public static void main (String [] args)
   {
      //Setting up for input
      Scanner input = new Scanner(System.in); 
      
      //Set up my variables and statics
      double retailPrice, profit;
      
      System.out.print("Let us figure out the profit for a circuit " + 
         "board shall we.\nPlease enter in the retail cost of each board: $");
      retailPrice = input.nextDouble();
      
      profit = retailPrice * .4;
      
      System.out.print("\n\nThe profit per board will be: $");
      System.out.format("%.2f%n", profit);
   }
}         
      