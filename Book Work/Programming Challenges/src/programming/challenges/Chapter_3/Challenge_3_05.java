/*
Daniel Gail
Oct 15, 2014

Chapter 3 Programming Challenges

Challenge #05                   

Mass and Weight

Scientists measure an object's mass in kilograms and its weight in Newtons. 
If you know the amount of mass that an object has, you can calculate its 
weight, in Newtons, with the following formula:

   Weight = mass x 9.8
   
Write a program that asks the user to enter an object's mass, and then calculate 
its weight. If the object weighs more than 1000 Newtons, display a message 
indicating that it is too heavy. If the object weighs less than 10 Newtons, 
display a message indicating that the object is to light. 

*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_05
{
   public static void main (String [] args)
   {
      double weight, mass;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Please enter the mass of the object in " +
                  "kilograms: ");
      mass = input.nextDouble();
      
      weight = mass * 9.8;
      
      if (weight < 10) 
      {
         System.out.println("\nThe mass of the object is to small to " +
               "calculate correctly. Sorry.");
      }
      else if (weight > 1000)
      {
         System.out.println("\nThe mass of the object is to great to " +
               "calculate correctly. Sorry.");
      }
      
      else 
      {
         System.out.printf("The weight of the object in Newtons is : %.2f%n",  
               weight);
      }                   
   }
}