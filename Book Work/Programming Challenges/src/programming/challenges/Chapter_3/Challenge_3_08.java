/*
Daniel Gail
Oct xx, 2014

Chapter 3 Programming Challenges

Challenge #08   

Software Sales

A software company sells a package that retails for $99. Quantity discounts are 
given according to the following table:

Quantity       Discount
10-19          20%
20-49          30%
50-99          40%
100 or more    50%
   
Write a program that asks the user to enter the number of packages purchased.
The program should then display the amount of the discount (if any) and the 
total amount of the purchase after the discount.    
                
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_08
{
   public static void main (String [] args)
   {
      double packages, discount = 0;
            
      Scanner input = new Scanner (System.in);
      
      System.out.print("Please enter in the number of packages purchased: ");
      packages = input.nextDouble();
      
      if (packages < 10)
      { 
         System.out.println("\nSorry you do not get a discount.");
      }
      
      if (packages > 10 && packages <= 19)
      {
         discount = .2;
         System.out.println("\nYour discount amount will be 20%.");
      }   
      
      if (packages >= 20 && packages <= 49)
      {
         discount = .3;
         System.out.println("\nYour discount amount will be 30%.");
      }  
      
      if (packages >= 50 && packages <= 99)
      {
         discount = .4;
         System.out.println("\nYour discount amount will be 40%.");
      }  
      
      if (packages >= 100)
      {
         discount = .5;
         System.out.println("\nYour discount amount will be 50%.");
      }  
      
      System.out.printf("\n\nYou ordered %.0f", packages);
      System.out.printf(" packages.\nThe purchase total is: $%.2f",  (packages * 99));
      System.out.printf("\nYour total discount is: $%.2f",
            ((packages * 99) * discount));  
      System.out.printf("\nMaking the final cost to you: $%.2f",  
            ((packages * 99) - ((packages * 99) * discount)));
   }
}