/*
Daniel Gail
Feb 1, 2015
COSC 1437
Week 2 Assignment
 */

/*
****Instructions****

In one program file, write a program that uses a two-dimensional array to 
store the highest and lowest temperatures of each month of the year. The 
program should output the average high, average low, and the highest and 
lowest temperatures for the year. Your program must consist of the 
following methods:

getData: This method reads and stores data in the two-dimensional array.
averageHigh: This method calculates and returns the average high 
    temperature for the year.
averageLow: This method calculates and returns the average low temperature 
    for the year.
indexHighTemp: This method returns the index of the highest high 
    temperature in the array.
indexLowestTemp: This method returns the index of the lowest temperature 
    in the array.
(These methods must all have appropriate parameters.)

Hint: Remember that even though the array is multidimensional, there are 
only two rows.

Please document your code with your name, date, and whatever useful 
comments is needed in your code.
*/

import javax.swing.JOptionPane;

public class Weather_Analysis 
{
    public static void main(String[] args)
    {
        int[][] temps = new int[12][2]; // Sets up the main array
        
        /* 
            Decided to set up a second array to hold all the months.
            Did this for the practice and got it from one of the book
            examples. 
        */
        String[] months = { "January", "February", "March",
            "April", "May", "June", "July", 
            "August", "September", "October",
            "November", "December" }; 
        
        /* 
            This is the only way I could figure out how to toss both 
            arrays to my method. If there is a better way I would LOVE
            to read about it. 
        */
        getData(temps, months); 
                
        JOptionPane.showMessageDialog(null, "The average high " +
                "temperature for the year was: " + averageHigh(temps),
                "Average High Temp",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "The average low " + 
                "temperature for the year was: " + averageLow(temps),
                "Average Low Temp",
                JOptionPane.PLAIN_MESSAGE);        
        JOptionPane.showMessageDialog(null, "The highest temperature " +
                "for the year was: " + indexHighTemp(temps),
                "Highest Temperature",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "The lowest temperature " +
                "for the year was: " + indexLowTemp(temps),
                "Lowest Temperature",
                JOptionPane.PLAIN_MESSAGE);
                
        System.exit(0);
    }
    
    // getData method asks the user for the temperatures.
    // @return High and lowest temperatures for each month.
    public static int[][] getData(int[][] array, String[] months)
    {
        String input;
        
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                if (col == 0)
                {
                    
                    input = JOptionPane.showInputDialog(null,"Enter " +
                        "the low temperature for " + months[row] + ": ", 
                        "Enter Low Temp", JOptionPane.PLAIN_MESSAGE);
                    array[row][col] = Integer.parseInt(input);    
                }
                else
                {
                    input = JOptionPane.showInputDialog(null,"Enter " +
                        "the high temperature for " + months[row] + ": ", 
                        "Enter High Temp", JOptionPane.PLAIN_MESSAGE);
                    array[row][col] = Integer.parseInt(input); 
                }
            }
        }
        return array;
    }
    
    // averageLow method calculates the average of all the low 
    // tempratures for the year that was entered.
    // @return Average of all the low temperatures that was entered.
    public static int averageLow(int[][] array)
    {
        double average = 0;
        
        for (int index = 0; index < array.length; index++)
        {
            average += array[index][0];
        }
        
        average = average / 12;
        
        // Returning as an int since a double would only be
        // applicable in a scientific program. I used an int
        // return for astetics. 
        return (int)average;
    }
    
    // averageHigh method calculates the average of all the high 
    // tempratures for the year that was entered.
    // @return Average of all the high temperatures that was entered.
    public static int averageHigh(int[][] array)
    {
        double average = 0;
        
        for (int index = 0; index < array.length; index++)
        {
            average += array[index][1];
        }
        
        average = average / 12;
        
        // Returning as an int since a double would only be
        // applicable in a scientific program. I used an int
        // return for astetics. 
        return (int)average; 
    }
    
    // indexHighTemp method calculates and returns the highest 
    // temprature
    //@return Returns highest temprature from an array
    public static int indexHighTemp(int[][] array)
    {
        int high = array[0][1];
        
        for (int index = 0; index < array.length; index++)
        {
            if (array[index][1] > high)
                high = array[index][1];
        }
        
        return high;
    }
    
    // indexLowTemp method calculates and returns the lowest 
    // temprature
    // @return Returns lowest temprature from an array
    public static int indexLowTemp(int[][] array)
    {
        int low = array[0][0];
        
        for (int index = 0; index < array.length; index++)
        {
            if (array[index][0] < low)
                low = array[index][0];
        }
        
        return low;
    }
}
