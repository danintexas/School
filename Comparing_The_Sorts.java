/*
Daniel Gail
Feb 8, 2015
COSC 1437
Week 3 Assignment
 */

/**
 * ***Instructions***
 * Write a program that creates 3 identical arrays, list1, list2, 
 * and list3 of 5000 elements. There program then sorts list1 using
 * bubble sort, list2 using selection sort, and list3 using insertion
 * sort and outputs the number of comparisons and item assignments made
 * by each sorting algorithm.
 * 
 * Hint: Use the Random class to randomly fill array list1 and then 
 * copy that array to list2 and list3. Use of the int data type is 
 * preferred.
 */

import java.util.Random;

public class Comparing_The_Sorts 
{
    public static void main(String[] args)
    {
        // First thing is to set up the three arrays and fill em up!
        int[] list1 = new int[5000];
        int[] list2 = new int[5000];
        int[] list3 = new int[5000];
        
        int counter; // Int used for my loop counters
        
        Randomizer(list1);
        
        // Filling out list2 and list3 arrays wit the values
        // from list1.
        for (counter = 0; counter < list2.length; counter++)
            list2[counter] = list1[counter];
        
        for (counter = 0; counter < list3.length; counter++)
            list3[counter] = list1[counter];
        
        BubbleSort(list1);
        SelectionSort(list2);
        InsertionSort(list3);
    }
    
    // Method that fills an array with random int amounts
    public static int[] Randomizer(int[] random)
    {
        for (int counter = 0; counter < random.length; counter++)
        {
            Random rand = new Random();
            random[counter] = rand.nextInt((999999999 - 1) + 1) + 1;  
        }
        
        return random;
    }
    
    // Sorting method that uses the Bubble sort method
    public static int[] BubbleSort(int[] bubble)
    {
        // After looking online I liked the ease the book laid it out. 
        // Taken and adapted for my program from Chapter 16 - 
        // Code Listing 16-1
        int lastPos;    // Position of the last element to compare
        int index;      // Index of an element to compare
        int temp;       // Used to swap to elements
        int comp = 0;       // Number of comparisons
        int assign = 0;     // Number of assignments
        
        for (lastPos = bubble.length - 1; lastPos >= 0; lastPos--)
        {
            for (index = 0; index <= lastPos - 1; index++)
            {
                comp++;             
                if (bubble[index] > bubble[index + 1])
                {
                    // Swap the two elements.
                    temp = bubble[index];
                    bubble[index] = bubble[index + 1];
                    bubble[index + 1] = temp;
                    assign++;
                }
            }
        }
        
        System.out.println ("Bubble Sort Method");
        System.out.println("Comparisons made: " + comp + 
                "\tAssignments made: " + assign + "\n");
        
        return bubble;
    }
    
    // Sorting method that uses the Selection sort method
    public static int[] SelectionSort(int[] selection)
    {
        // Method adapted for my program from Chapter 16 Code 
        // Listing 16-6
        int startScan;  // Starting position of the scan
        int index;      // To hold a subscript value
        int minIndex;   // Element with smallest value in the scan
        int minValue;   // The smallest value found in the scan
        int comp = 0;       // Number of comparisons
        int assign = 0;     // Number of assignments
        
        for (startScan = 0; startScan < (selection.length-1); 
                        startScan++)
        {
            minIndex = startScan;
            minValue = selection[startScan];
            
            for(index = startScan + 1; index < selection.length; index++)
            {
                comp++;
            
                if (selection[index] < minValue)
                {
                    minValue = selection[index];
                    minIndex = index;
                    assign++;
                }
            }
            
            selection[minIndex] = selection[startScan];
            selection[startScan] = minValue;
            
        }
        
        System.out.println ("Selection Sort Method");
        System.out.println("Comparisons made: " + comp + 
                "\tAssignments made: " + assign + "\n");
        
        return selection;
    }
    
    // Sorting method that uses the Insertion sort method
    public static int[] InsertionSort(int[] insertion)
    {
        // Method adapted for my program from Chapter 16 Code 
        // Listing 16-9
        int unsortedValue;  // The first unsorted value
        int scan;           // Used to scan the array
        int comp = 0;       // Number of comparisons
        int assign = 0;     // Number of assignments
        
        for (int index = 1; index < insertion.length; index++)
        {
            unsortedValue = insertion[index];
            scan = index;
            
            while (scan > 0 && insertion[scan - 1] > unsortedValue)
            {
                insertion[scan] = insertion[scan-1];
                scan--;
                comp++;
            }
            
            assign++;
            insertion[scan] = unsortedValue;
        }
        
        System.out.println ("Insertion Sort Method");
        System.out.println("Comparisons made: " + comp + 
                "\tAssignments made: " + assign + "\n");
        
        return insertion;
    }
}
