/*
Daniel Gail
Oct 17, 2014

Chapter 3 Programming Challenges

Challenge #09   

Shipping Charges

The Fast Frieght Shipping Company charges the following rates:

Weight of Package                                  Rate per 500 Miles Shipped    
                
2 pounds or less                                            $1.10
Over 2 pounds but not more than 6 pounds                    $2.20
Over 6 pounds but not more than 10 pounds                   $3.70
Over 10 pounds                                              $3.80

The shipping charges per 500 miles are not prorated. For example, if a 2-pound 
package is shipped 550 miles, the charges would be $2.20. Write a program that 
asks the user to enter the weight of a package and then displays the shipping 
charges.                    
                
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_09
{
   public static void main (String [] args)
   {
      int roundedMiles, weight;
      double cost, miles;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Please enter in the weight of the package: ");
      weight = input.nextInt();
      
      System.out.print("\nPlease enter in the distance the package traveled: ");
      miles = input.nextDouble();
      
      roundedMiles = ((int)miles / 500);
      
      if ((miles / 500) / roundedMiles > 1)
      {
         roundedMiles = roundedMiles + 1;
      }   
            
      if (weight <= 2)
      {
         cost = roundedMiles * 1.10;
      }
      
      else if (weight > 2 && weight <= 6)
      {
         cost = roundedMiles * 2.20;
      }
      
      else if (weight > 6 && weight <= 10)
      {
         cost = roundedMiles * 3.70;
      }
      
      else 
      {
         cost = roundedMiles * 3.80;  
      }
      
      System.out.printf("\nTotal cost to ship: $%.2f" , cost);          
   }
}