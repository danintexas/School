// Daniel Gail
// Spet 26, 2014
// Chapter 3 Page 120

package Chapter_3;

import java.util.Scanner;

public class Division
{
   public static void main (String [] args)
   {
      double number1, number2;
      double quotient;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Enter a number: ");
      number1 = keyboard.nextDouble();
      
      System.out.print("Enter another number: ");
      number2 = keyboard.nextDouble();
      
      if (number2 == 0)
      {
         System.out.println("\nDivision by zero is not possible.");
         System.out.println("Please run the program again and");
         System.out.println("enter a number other than zero.");
      }
      
      else 
      {
         quotient = number1 / number2;
         System.out.print("The quotient of " + number1);
         System.out.print(" divided by " + number2);
         System.out.print(" is ");
         System.out.format("%.1f%n", quotient);
         System.out.println(); 
      }     
   }   
}