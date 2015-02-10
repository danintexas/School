/* 
Daniel Gail
Sept 24, 2014
Chapter 2 Challenge 09

Ask the user for the miles drive and the amount of gas used.
Return the average MPG to the display
*/

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_09
{
   public static void main (String [] args)
   {
      // Declare all my variables needed
      int milesDriven, gallonsGas, averageMPG;
      Scanner user_input = new Scanner(System.in);
      
      System.out.print("We will now calculate your average MPG\n");
      
      System.out.print("\nPlease enter in the miles you have drive: ");
      milesDriven = user_input.nextInt();
      
      System.out.print("\nNow please enter in the gallons of gas used: ");
      gallonsGas = user_input.nextInt();
      
      averageMPG = milesDriven / gallonsGas;
      
      System.out.println("The average MPG you had was: " + averageMPG);
   }
}   