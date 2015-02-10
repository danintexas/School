////////////////////////////////////////////////////////////////////
// Daniel Gail
// Oct 13, 2014
// 
// Chapter 3 Programming Challenge
// Challenge #01
//
// Roman Numerals
// Write a program that prompts the user to enter a number with in 
// the range of 1 through 10. The program should display the Roman
// numeral version of that number. If the number is outside the 
// range of 1-10, the program should display an error message. 
////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_01
{
   public static void main (String [] args)
   {
      int number, input;
      
      System.out.print("Please enter in a number from 1 to 10: ");
      Scanner sc = new Scanner(System.in);
      input = sc.nextInt();
      
      System.out.println();
      
      switch (input)
      {
         case 1: 
            System.out.println("1 = I");
            break;
         case 2: 
            System.out.println("2 = II");
            break;
         case 3: 
            System.out.println("3 = III");
            break;
         case 4:
            System.out.println("4 = IV");
            break;
         case 5: 
            System.out.println("5 = V");
            break;
         case 6:
            System.out.println("6 = VI");
            break;
         case 7:
            System.out.println("7 = VII");
            break;
         case 8:
            System.out.println("8 = VIII");
            break;
         case 9:
            System.out.println("9 = IX");
            break;
         case 10:
            System.out.println("10 = X");
            break;
         default:
            System.out.println("Sorry only the numbers 1 through 10 are supported.");
         
      }
   }
}                                              
      