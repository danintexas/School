/*
Daniel Gail
Jan 30, 2015

Chapter 8
Code Listing 8-8
Page 427
 */

package Chapter_08;

/**
 * This program demonstrates passing individual array
 * elements as arguments to a method.
 */

public class PassElements 
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
        
        for (int index = 0; index < numbers.length; index++)
            showValue(numbers[index]);
    }
    
    /**
     * The showValue method displays its argument.
     * @param n The value to display.
     */
    
    public static void showValue(int n)
    {
        System.out.print(n + " ");
    }
}
