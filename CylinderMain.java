/*
Daniel Gail
March 9, 2015
COSC 1437
Week 5/6 Assignment
 */

import java.util.Scanner;

public class CylinderMain 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);       // User input
        double rad;         // Radius of the Cylinders
        double length;      // The length of the Cylinders
        
        // Get the radius of Cylinder one
        System.out.println("What is the radius " +
                "of the first cylinder: ");
        rad = keyboard.nextDouble();
        
        // Get the length
        System.out.println("What is the length " +
                "of the first cylinder: ");
        length = keyboard.nextDouble();
    
        // Create the first Cylinder object
        Cylinder one = new Cylinder(rad, length);
    
        // Reset my variables to null values
        rad = 0.0d; 
        length = 0.0d;
        
        // Get the radius of Cylinder two
        System.out.println("What is the radius " +
                "of the second cylinder: ");
        rad = keyboard.nextDouble();
        
        // Get the length
        System.out.println("What is the length " +
                "of the second cylinder: ");
        length = keyboard.nextDouble();
    
        // Create the first Cylinder object
        Cylinder two = new Cylinder(rad, length);
        
        System.out.println(one);
        System.out.println("---------------------------------\n"
                + two);
        
        // Compare the two objects using the equals method in the 
        //      cylinder class
        if (one.equals(two))
            System.out.println("\nBoth objects are the same.\n");
        else 
            System.out.println("\nThe objects are different.\n");  
    }
}
