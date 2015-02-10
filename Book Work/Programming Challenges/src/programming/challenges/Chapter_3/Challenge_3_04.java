/*
Daniel Gail
Oct 15, 2014

Chapter 3 Programming Challenges

Challenge #04   

Test Scores and Grade

Write a program that has variables to hold three test scores. The program
should ask the user to enter three test scores and then assign the values
entered to the variables. The program should display the average of the 
test scores and the letter grade that is assigned for the test score 
average. Use the grading scheme in the following table:

90-100      A
80-89       B
70-79       C
60-69       D
Below 60    F                
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_04
{
   public static void main (String [] args)
   {
      int test1, test2, test3, average;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Please enter in the first test score: ");
      test1 = input.nextInt();
      
      System.out.print("\nPlease enter in the second test score: ");
      test2 = input.nextInt();
      
      System.out.print("\nLastly the third test score: ");
      test3 = input.nextInt();
      
      average = (test1 + test2 + test3) / 3;
      
      System.out.println("\nThe average is: " + average);
      
      if (average > 100)
      {
         System.out.println("Please check your test scores. The average " +
               "can not be higher than 100.");
      }
      
      else if (average > 89)
      {
         System.out.println("The average is an A!");
      }
      
      else if (average > 79)
      {
         System.out.println("The average is a B.");
      }
      
      else if (average > 69)
      {
         System.out.println("The average is a C.");
      }
      
      else if (average > 59)
      {
         System.out.println("The average is a D.");
      }
      
      else
      {
         System.out.println("The average is a F.");
      }                              
   }
}