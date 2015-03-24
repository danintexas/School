/*
Daniel Gail
March 8, 2015
COSC 1437
Week 5/6 Assignment
 */

public class Cylinder 
{
    private Circle circle;  // Circle object for the Cylinder class
    private double length;  // Length of the cylinder
    
    // Constructor that sets the values sent to this class
    public Cylinder(double radius, double len)
    {
        circle = new Circle(radius);
        length = len;
    }
    
    // No-arg constructor
    // Sets the default Circle and length
    public Cylinder()
    {
        length = 0.0;
        circle = new Circle(0);
    }
    
    // Copy constructor
    public Cylinder copyCylinder(Cylinder copyCylinder)
    {
        // Returns a copy of the Cylinder object.
        return new Cylinder(copyCylinder.getSurfaceArea(),
                            copyCylinder.getVolume());
    }
    
    // Returns the length of the cylinder
    public double getLength()
    {
        return length;
    }
    
    // Returns the radius of the cylinder
    public double getRadius()
    {
        return (circle.getDiameter() / 2);
    }
    
    // Returns the surface area of the cylinder.
    // Volume of a cylinder is 
    //      (2*pi*radius*length) + (2*pi*radius(sq))
    // I make a call to circle.calcCircumference since that
    // method is doing 2*pi*radius for me.
    public double getSurfaceArea()
    {
        return ((circle.calcCircumference()) * length) +
                (circle.calcCircumference()) * 
                (circle.getDiameter() / 2);
    }
    
    // Returns the Volume of the Cylinder
    public double getVolume()
    {
        return circle.calcArea() * length;
    }
    
    // My equals method that took me 4 days to figure out!!!
    // DO NOT ask me why it took that long. I don't know. It just wasn't
    // clicking with me and I was about ready to go insane. 
    // This compares two Cylinder objects and returns a boolean
    // true/false on if they are the same or not. 
    public boolean equals (Cylinder reference)
    {
        boolean status;
        
        if (getLength() == reference.getLength() &&
                getRadius() == reference.getRadius())
            status = true;  // Yes, the objects are equal.
        else
            status = false; // No, the objects are not equal.
        
        return status;
    }
    
    // toString method that will output all the data in this class
    public String toString()
    {
        String str = "Cylinder Radius: " + (circle.getDiameter() / 2)
                + "\nCylinder Diameter: " + circle.getDiameter()
                + "\nCylinder Length: " + length 
                + "\nCylinder Surface Area: " + getSurfaceArea()
                + "\nCylinder Volume: " + getVolume();
        
        // Return the string
        return str;
    }
}
