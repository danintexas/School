/*
Daniel Gail
Jan 29, 2015

Chapter 8
Code Listing 8-4
Page 415
 */

package Chapter_08;

/**
 * This program shows an array being initialized. 
 */

public class ArrayInitialization 
{
    public static void main(String[] args)
    {
        int[] days = { 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };
        
        for (int index = 0; index < 12; index++)
        {
            System.out.println("Month " + (index + 1) +
                    " has " + days[index] +
                    " days.");
        }
    }
}
