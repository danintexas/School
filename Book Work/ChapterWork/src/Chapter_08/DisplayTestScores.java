/*
Daniel Gail
Jan 29, 2015

Chapter 8
Code Listing 8-6
Page 422
 */

package Chapter_08;

import java.util.Scanner; //Needed for Scanner class

/**
 * This program demonstrates how the user may specify an
 * array's size.
 */
public class DisplayTestScores 
{
    public static void main(String[] args)
    {
        int numTests;   // The number of tests
        int[] tests;    // Array of test scores
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the number of test scores.
        System.out.print("How many tests do you have? ");
        numTests = keyboard.nextInt();
        
        // Create an array to hold that number of scores.
        tests = new int[numTests];
        
        // Get the individual test scores.
        for (int index = 0; index < tests.length; index++)
        {
            System.out.print("Enter test score " +
                    (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
        }
        
        // Display the test scores.
        System.out.println();
        System.out.println("Here are the scores you entered:");
        for (int index = 0; index < tests.length; index++)
            System.out.print(tests[index] + " ");
    }
}
