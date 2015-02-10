////////////////////////////////////////////////////
// Daniel Gail
// Sept 30, 2014
//
// Chapter 3 Page 153 - 154
////////////////////////////////////////////////////

package Chapter_03;

import java.util.Scanner;

public class SwitchDemo
{
   public static void main (String [] args)
   {
      int number;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Enter 1, 2, or 3: ");
      number = keyboard.nextInt();
      
      switch (number)
      {
         case 1:
            System.out.println("You entered 1.");
            break;
         case 2: 
            System.out.println("You entered 2.");
            break;
         case 3: 
            System.out.println("You entered 3.");
            break;
         default:
            System.out.println("That's not 1, 2, or 3!");
      }
   }
}                     