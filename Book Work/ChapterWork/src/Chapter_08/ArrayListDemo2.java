/*
Daniel Gail
Feb 1, 2015

Chapter 8
Code Listing 8-24
Page 479
*/

package Chapter_08;

import java.util.ArrayList; // Needed for ArrayList class

/*
    This program demonstrates how the enhanced for loop
    can be used with an ArrayList.
 */

public class ArrayListDemo2 
{
    public static void main(String[] args)
    {
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();
        
        // Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");
        
        // Display the size of the ArrayList.
        System.out.println("The ArrayList has " +
                nameList.size() +
                " objects stored in it.");
        
        // Now display the items in nameList.
        for (String name : nameList)
            System.out.println(name);
        
        // Example of how Java can print out the entire
        // ArrayList
        // Page 480
        System.out.println("\n" + nameList);
    }
}
