/*
Daniel Gail
Oct 15, 2014

Chapter 3 Programming Challenges

Challenge #06                   

Time Calculator

Write a program that asks the user to enter a number of seconds. 

   There are 60 seconds in a minute. If the number of seconds entered by the user 
   is greater than or equal to 60, the program should display the number of minutes
   in that many seconds. 
   
   There are 3600 seconds in an hour. If the number of seconds entered by the user 
   is greater tghan or equal to 3600, the program should display the number of 
   hours in that many seconds. 
   
   There are 86400 seconds in a day. If the number of seconds entereed by the user 
   is greater than or equal to 86400, the program should display the number of 
   days in that many seconds. 
   
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_06
{
   public static void main (String [] args)
   {
      int seconds, minutes, hours, days;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Please enter the number of seconds to calculate: ");
      seconds = input.nextInt();
      
      if (seconds >= 60)
      {
         minutes = seconds / 60;
         System.out.println("\nThe number of minutes in " + seconds + 
               " seconds is " + minutes);
               
         if (seconds >= 3600)
         {
            hours = seconds / 3600;
            System.out.println("\nThe number of hours in " + seconds +
                  " seconds is " + hours);
            
            if (seconds >= 86400)
            {
               days = seconds / 86400;
               System.out.println("\nThe number of days in " + seconds +
                     " seconds is " + days);
            }
         }
      }                           
   }
}