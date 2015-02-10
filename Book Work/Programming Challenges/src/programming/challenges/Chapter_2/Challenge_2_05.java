/*
 Daniel Gail
Sept 22, 2014
Chapter 2 Challenge 5
Program that stores two intergers (62,99) into variables then stores the sum
of both into a variable named 'total' then outputs all to display
 */

package programming.challenges.Chapter_2;

/**
 *
 * @author gailgail
 */
public class Challenge_2_05 
{
    public static void main (String [] args)
    {
        // Set up my variables
        int numberOne = 62, numberTwo = 99, total;
        
        //Do the calculation
        total = numberOne + numberTwo;
        
        // Output to display
        System.out.println(numberOne + " + " + numberTwo + " = " + total);
    }
}
