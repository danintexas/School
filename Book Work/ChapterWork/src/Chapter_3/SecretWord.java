/////////////////////////////////////////////////////////////////
// Daniel Gail
// Sept 28, 2014
//
// Chapter 3 Page 148 - 149
/////////////////////////////////////////////////////////////////

package Chapter_3;

import java.util.Scanner;

public class SecretWord
{
   public static void main (String [] args)
   {  
      String input;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Enter the secret word: ");
      input = keyboard.nextLine();
      
      if (input.equalsIgnoreCase("PROSPERO"))
      { 
         System.out.println("Congratulations! You know the " + 
               "secret word!");
      }
      else
      {
         System.out.println("Sorry, that is NOT the " +
               "secret word!");
      }
   }
}                        