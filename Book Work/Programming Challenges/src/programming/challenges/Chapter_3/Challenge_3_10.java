/*
Daniel Gail
Oct 18, 2014

Chapter 3 Programming Challenges

Challenge #10   

Fat Gram Calculator

Write a program that asks the user to enter the number of calories and fat grams 
in a food item. The program should display the percentage of the calories that 
come from fat. One gram of fat has 9 calories, therefore:
   
   Calories from fat = fat grams * 9
   
**Note: The number of calories from fat cannot be greater than the total number 
of calories in the food item. If the program determines that the number of 
calories from fat is greater than the number of calories in the food item, it 
should display an error message indicating that the input is invalid.        
                
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_10
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      double calories, fatGrams, fatCalories;
      
      System.out.print("Please enter in the amount of calories: ");
      calories = input.nextDouble();
      
      System.out.print("\nPlease enter in the amount of fat grams: ");
      fatGrams = input.nextDouble();
      
      fatCalories = fatGrams * 9;
      
      if (fatCalories > calories)
      {
         System.out.println("Please check your numbers as the number of " +
                  "\nfat calories can not exceed the number of calories " +
                  "in total.");
      }
      
      else
      {
         System.out.println("The number of calories that come from fat is " +
                  fatCalories + " calories.");            
      
      }
   }   
}