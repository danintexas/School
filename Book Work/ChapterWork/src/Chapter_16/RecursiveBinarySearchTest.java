/**
 * Daniel Gail
 * Feb 8, 2015
 * 
 * Chapter 16
 * Code Listing 16-17
 */

package Chapter_16;

import java.util.Scanner;

/**
 * This program tests the search method in the 
 * RecursiveBinarySearcher class.
 */

public class RecursiveBinarySearchTest 
{
    public static void main(String [] args)
    {
        int result, searchValue;
        String input;
        
        // An array of numbers to searc.
        int numbers[] = { 536, 289, 296, 429, 319, 142, 394,
                        101, 388, 147, 417, 199, 207, 222,
                        189, 310, 447, 521, 234, 600 };
        
        // Create a Scanner object to read keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // First we must sort the array in ascending order.
        IntQuickSorter.quickSort(numbers);
        
        do
        {
            // Get a value to search for.
            System.out.print("Enter a value to search for: ");
            searchValue = keyboard.nextInt();
            
            // Search for the value
            result =
                RecursiveBinarySearcher.search(numbers, searchValue);
            
            // Display the results.
            if (result == -1)
                System.out.println(searchValue + " was not found.");
            else
            {
                System.out.println(searchValue + " was found at " +
                        "element " + result);
            }
            
            // Consume the remaining newline.
            keyboard.nextLine();
            
            // Does the user wantto search again?
            System.out.print("Do you want to search again? (Y or N): ");
            input = keyboard.nextLine();
        }   while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }
}
