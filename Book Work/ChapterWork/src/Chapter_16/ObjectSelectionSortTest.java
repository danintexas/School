/**
 * Daniel Gail
 * Feb 8, 2015
 * 
 * Chapter 16
 * Code Listing 16-8
 */

package Chapter_16;

/**
 * This program tests the selectionSort method in the 
 * ObjectSelectionSorter class.
 */
public class ObjectSelectionSortTest 
{
    public static void main(String[] args)
    {
        // Create a String array with test values.
        // Note that String implements Comparable.
        String[] values = { "David", "Abe", "Katherine",
            "Beth", "Jeff", "Daisy" };
        
        // Display the array's contents.
        System.out.println("Original order: ");
        
        for (String element : values)
            System.out.print(element + " ");
        
        // Sort the array.
        ObjectSelectionSorter.selectionSort(values);
        
        // Display the array's contents.
        System.out.println("\nSorted order: ");
        for (String element : values)
            System.out.print(element + " ");
        
        System.out.println();
    }
}
