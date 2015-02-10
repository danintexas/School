/**
 * Daniel Gail
 * Feb 8, 2015
 * 
 * Chapter 16
 * Code Listing 16-18
 */

package Chapter_16;

/**
 * This program times calls to the recursive Fibonacci method
 * for 6 consecutive calls and displays the results.
 */

import java.util.*;

public class RecursiveFibonacciTimer 
{
    public static void main(String[] args)
    {
        // Getthe starting argument.
        System.out.println("Enter a positive integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // Variables used to determine time for a function call
        long currentTime = new Date().getTime();
        long previousTime;
        long elapsedTime = 0;
        
        for (int k = 0; k <= 5; k++)
        {
            // Record time before calling the method
            previousTime = currentTime;
            System.out.print("Fibonacci term at position ");
            System.out.print((number + k) + " is ");
            // Compute and print fib term for the next argument
            System.out.println(fib(number + k));
            // Record time after calling the method
            currentTime = new Date().getTime();
            // Compute and print elapsed time in seconds.
            elapsedTime = (currentTime - previousTime)/1000;
            System.out.println("computed in " + elapsedTime + 
                                " seconds.");
        }
    }
    /**
     * Computes a term of the Fibonacci sequence
     * @param n
     * @return nth term of the sequence
     */
    public static long fib(long n)
    {
        if (n <= 1)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }
}
