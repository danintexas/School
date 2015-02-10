/*
Daniel Gail
Jan 29, 2015

Chapter 8
Code Listing 8-3
Page 413
 */

package Chapter_08;

/**
 * This program uses an invalid subscript with an arry
 */

public class InvalidSubscript 
{
    public static void main(String[] args)
    {
        int[] values = new int[3];
        
        System.out.println("I will attempt to store four " +
                "numbers in a three-element array.");
        
        for (int index = 0; index < 4; index++)
        {
            System.out.println("Now processing element " + index);
            values[index] = 10;
        }
    }
}
