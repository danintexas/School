/*
Daniel Gail
Oct 23, 2014

Chapter 3 Programming Challenges

Challenge #07   

Second Names

Write a program that asks the user to enter three names, and then displays the 
names sorted in ascending order. For example, if the user entered "Charlie", 
"Leslie", and "Andy", the program would display:
   
   Andy
   Charlie
   Leslie      
                
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;
import java.lang.*;

public class Challenge_3_07
{
   public static void main (String [] args)
   {
      String name1, name2, name3;
      Scanner input = new Scanner (System.in);
   
      System.out.print("Please enter in the first name to sort: ");
      name1 = input.nextLine();
      
      System.out.print("\nPlease enter in the second name to sort: ");
      name2 = input.nextLine();
      
      System.out.print("\nPlease enter in the third name to sort: ");
      name3 = input.nextLine();
      
      
      
      if (name1.compareTo(name2) < 1)
      { 
         if (name1.compareTo(name3) < 1)
         {
            if (name2.compareTo(name3) < 1)
            {
               System.out.println("\n" + name1 + "\n" + name2 + "\n" + name3);
            }
            
            else 
            {
               System.out.println("\n" + name1 + "\n" + name3 + "\n" + name2);
            }
         }
               
         else          
         {
            System.out.println("\n" + name3 + "\n" + name1 + "\n" + name2);    
         } 
      }
      
      else
      {
         if (name2.compareTo(name3) < 1)
         {
            if (name3.compareTo(name1) < 1)
            {
               System.out.println("\n" + name2 + "\n" + name3 + "\n" + name1);
            }
            
            else
            {
               System.out.println("\n" + name2 + "\n" + name1 + "\n" + name3);
            }
         }
         
         else
         {
            System.out.println("\n" + name3 + "\n" + name2 + "\n" + name1);
         }
      }               
   }
}      