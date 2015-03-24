/*
Daniel Gail
Feb 14, 2015
COSC 1437
Week 4 Assignment
 */

public class Circle 
{
    private double radius;          // Radius of the circle
    
    // No-arg constructor
    // Sets the default radius to 0.0.
    public Circle()
    {
        radius = 0.0;
    }
    
    // Constructor that sets the radius to the number
    // passed to the class. 
    // @param rad The radius of the circle in question 
    public Circle(double rad)
    {
        radius = rad;
    }
    
    // Method to return the area of the circle.
    // @return The radius of the circle.
    public double calcArea()
    {
        return (radius * radius) * Math.PI;   
    }
    
    // Method to return the diameter of the circle. 
    // @return The diameter of the circle.
    public double getDiameter()
    {
        return radius * 2;
    }
    
    // Method to return the circumfrance of the circle.
    // Used the value of Pi that came up on a Google search.
    // @return The circumfrance of the circle. 
    public double calcCircumference()
    {
        return 2 * Math.PI * radius;
    }
    
    // Simple method to return the radius.
    // This is here for the isEqual method to work with. 
    // @return The radius of the object.
    public double getRadius()
    {
        return radius;
    }
    
    // This method had me stumped for literally days. 
    // I am still unsure if this is what you were asking.
    // If you could please take a second to point me in the right 
    // direction on this one it would allow me to sleep. 
    // @return true or false 
    public boolean isEqual()
    {
        // Creates a new object Circle with the default constructor
        Circle ref = new Circle(); 
        
        return radius == ref.getRadius();
    }
    
}
