/*
Daniel Gail
Sept 22, 2014
Chapter 2 Challenge #2
Input my full name into three variables and then parse the first letter of 
each into my initials and output all to the display
 */

package programming.challenges.Chapter_2;

public class Challenge_2_02 
{
    public static void main(String [] args)
    {
        // Setting up my variables
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;
        
        // Assigning my literals
        firstName = "Daniel";
        middleName = "Richard";
        lastName = "Gail";
        
        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);
        
        System.out.println("My name is: " + firstName + " " + middleName + 
                " " + lastName);
        System.out.println("\nMy initials are: " + firstInitial + middleInitial
                + lastInitial + "\n");
        System.out.println("My lord this shit is so much damn fun!");
    }
}
