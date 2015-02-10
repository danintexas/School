/*
Daniel Gail
Dec 8, 2014

Chapter 3
Programming Challenge 13
Page 191

Program takes in user input for a selected Internet package and the number of 
hours the user has used the internet for a month. The program will then display
the total charge.
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_13
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        String internetPackage;
        int hoursUsed, baseHours;
        double total;
        
        System.out.println("The following is the list of Internet Packages" +
                " we offer.\n");
        System.out.println("Package A: $9.95 a month for 10 hours " +
                "with $2.00 for each hour over.");
        System.out.println("Package B: $13.95 a month for 20 hours " +
                "with $1.00 for each hour over.");
        System.out.println("Package C: $19.95 a month unlimited access.\n");
        
        System.out.println("Please select which package you wish to have" +
                " (A, B, C)");
        internetPackage = input.nextLine();
                
        System.out.println("\nPlease enter in the number of house you " +
                "use the internet in a month.");
        hoursUsed = input.nextInt();
        
        if (internetPackage.contains("a") || internetPackage.contains("A"))
        {
           if (hoursUsed > 10)
           {
               baseHours = hoursUsed - 10;
               total = 9.95 + (baseHours * 2);
           }
           
           else 
           {
               total = 9.95;
           }
           
           System.out.println("The total of your internet bill is: $" +
                   total);
        }
        
        else if (internetPackage.contains("b") || internetPackage.contains("B"))
        {
            if (hoursUsed > 20)
            {
                baseHours = hoursUsed - 20;
                total = 13.95 + baseHours;
            }
            
            else
            {
                total = 13.95;
            }
            
            System.out.println("The total of your internet bill is: $" +
                   total);
        }
        
        else if (internetPackage.contains("c") || internetPackage.contains("C"))
        {
           total = 19.95;
           
           System.out.println("The total of your internet bill is: $" +
                   total);
        }
        else
        {
            System.out.println("Chad is poop");
        }
    }
}