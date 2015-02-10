/*
Daniel Gail
Jan 30, 2015

Chapter 8
Code Listing 8-15
Page 446
 */

package Chapter_08;

/**
 * This program demonstrates an array of String objects.
 */

public class MonthDays 
{
    public static void main(String[] args)
    {
        String[] months = { "January", "February", "March",
            "April", "May", "June", "July", 
            "August", "Spetember", "October",
            "November", "December" };
        
        int[] days = { 31, 28, 31, 30, 31, 30, 31,
            31,30,31,30,31 };
        
        for (int index = 0; index < months.length; index++)
        {
            System.out.println(months[index] + " has " +
                    days[index] + " days.");
        }
    }
}
