////////////////////////////////////////////////////////////////
// Daniel Gail
// Oct 13, 2014
//
// Chapter 3 Programming Challenges
//
// Challenge #02
//
// The date June 10, 1960, is special because when we write 
// it in the following format, the month times the day 
// equals the year: 
//
//                   6/10/60
//                  
// Write a program that asks the user to enter a month (in 
// numeric form), a day, and a two-digit year. The program 
// should then determine whether the month times the day is 
// equal to the year. If so, it should display a message 
// saying the date is magic. Otherwise it should display a 
// message saying the date is not magic.                   
////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_02
{
   public static void main (String [] args)
   {
      int month, day, year;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter a month in number form: ");
      month = input.nextInt();
      
      System.out.println();
      
      System.out.print("Please enter a day in number form: ");
      day = input.nextInt();
      
      System.out.println();
      
      System.out.print("Please enter the last two digits of a year: ");
      year = input.nextInt();
      
      System.out.println("\nThe date you entered is: " + month + "/" + day +
                     "/" + year);
      
      if (day * month == year)
      {
         System.out.println("WOO HOO! That is a magic date!");
      }
      else
      {
         System.out.println("That is not a magic date. Sorry.");
      }         
   }
}      