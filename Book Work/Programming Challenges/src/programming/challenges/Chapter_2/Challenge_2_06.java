/*
 Daniel Gail
Sept 22, 2014
Chapter 2 Challenge 6
Calculate a 62% sales amount for East Coast sales division based a total 
$4.6 million for the whole company - output to screen
 */
package programming.challenges.Chapter_2;

import java.text.DecimalFormat;

public class Challenge_2_06 
{
    public static void main (String [] args)
    {
        double percent = .62;
        int companySales = 4600000, percentSimple;
        
        // Math
        double total = companySales * percent;
        percentSimple = (int) (percent * 100);
        
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
        System.out.print("Total company wide sales: $" + df.format(companySales)
                + "\n");
        System.out.println("East Coast sales divison accounted for " + 
                percentSimple + "%");
        System.out.println("Which amounted to : $" + df.format(total) + 
                " in sales.");
        System.out.println("\nWAY TO GO TEAM!");
    }
}
