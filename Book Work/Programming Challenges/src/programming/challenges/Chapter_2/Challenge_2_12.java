///////////////////////////////////////////////////////////////////////////
//Daniel Gail
//Sept 24, 2014
//Chapter 2 Challenge 12
//
//Program that takes as input a city name
// 1) Count the number of characters in the city
// 2) Uppercase all letters in the city
// 3) Lowercase all letters in the city
// 4) First character of the city name
///////////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_12
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in); //Sets up for input
      
      System.out.print("Please enter in the name of a city: ");
      String city = input.nextLine();
      
      //Lets do the work
      String lower = city.toLowerCase(), upper = city.toUpperCase();
      int length = city.length();
      char first = city.charAt(0);
      
      //Print it all out
      System.out.println("\nNumber of characters in your city name is: " + length);
      System.out.println("Lowercase: " + lower + "\nUppercase: " + upper);
      System.out.println("The first letter of your city is: " + first);   
   }
}      