/*
Daniel Gail
Feb 14, 2015
COSC 1437
Week 4 Assignment
 */

/*
Your assignment is to create a class named Circle.  This class is to have
    a private member of type double called radius.  The class should have 
    a no-arg constructor as well as a parameterized constructor.  The 
    class should also have the following members:

- calcArea() - a double returning method that calculates the area of the 
    circle based on its radius
- getDiameter() - a double returning method that returns the diameter of 
    the circle
- calcCircumference() - a double returning method that calculates the 
    circumference of the circle based on its radius
- isEqual() - a boolean returning method that should have a Circle object 
    as the method parameter. The method should analyze the radius of the 
    calling object with the radius of the parameter method and return true 
    if the radii are the same and false otherwise.

Write a main method and create an object or more of the type Circle and 
    demonstrate the Circle methods in action. 
 */

import javax.swing.JOptionPane;

public class CircleMain 
{
    public static void main(String[] args)
    {
        String input;    // Holds the user input.
        double rad;      // Radius of the circle.
    
        // Get the radius
        input = JOptionPane.showInputDialog("What is the radius " +
            "of the circle to calculate?");
        rad = Double.parseDouble(input);
        
        // Create a circle object from my class named c.
        Circle c = new Circle(rad);
        
        // Print out the total area of the circle calling to the
        // calcArea method with in the circle class.
        JOptionPane.showMessageDialog(null, "The total area of the " +
                "circle is: " + c.calcArea());
        
        // Print out the diameter of the circle calling to the
        // getDiameter method with in the circle class.
        JOptionPane.showMessageDialog(null, "The diameter of the " +
                "circle is: " + c.getDiameter());
        
        // Print out the circumference of the circle calling to the
        // calcCircumference method with in the circle class.
        JOptionPane.showMessageDialog(null, "The circumference of the " +
                "circle is: " + c.calcCircumference());
        
        // Print out a summary of all of the above. 
        JOptionPane.showMessageDialog(null, "Area: " + 
                c.calcArea() + "\nDiameter: " +
                c.getDiameter() + "\nCircumference: " +
                c.calcCircumference());
        
        // Display a final message if the radius matches the 
        // default construtor using the isEqual method in the 
        // Circle class.
        if (c.isEqual())
            JOptionPane.showMessageDialog(null, "The radius is the " +
                    "same as the default constructor!");
        
        System.exit(0);
    }
}
