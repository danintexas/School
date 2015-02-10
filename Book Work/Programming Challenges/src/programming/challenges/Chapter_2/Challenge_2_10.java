/*
Daniel Gail
Sept 24, 2014
Chapter 2 Challenge 10

This program will request 3 test scores from the user and then return
   the average of those test scores
*/

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_10
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      int testOne, testTwo, testThree, average;
      
      System.out.print("Please enter in the first test score: ");
      testOne = input.nextInt();
      
      System.out.print("\nPlease enter in the second test score: ");
      testTwo = input.nextInt();
      
      System.out.print("\nPlease enter in the third test score: ");
      testThree = input.nextInt();
      
      average = (testOne + testTwo + testThree) / 3;
      
      System.out.println("\n\nThe test average is: " + average);
   }
}         
   