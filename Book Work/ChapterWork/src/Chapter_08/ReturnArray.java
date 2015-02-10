/*
Daniel Gail
Jan 30, 2015

Chapter 8
Code Listing 8-14
Page 444 - 445
 */

package Chapter_08;

/**
 * This program demonstrates how a reference to an 
 * array can be returned from a method.
 */

public class ReturnArray 
{
    public static void main(String[] args)
    {
        double[] values;
        
        values = getArray();
        for (double num : values)
            System.out.print(num + "\n");
    }
    
    /**
     * getArray method
     * @return A reference to an array of doubles.
     */
    
    public static double[] getArray()
    {
        double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };
        
        return array;
    }
}
