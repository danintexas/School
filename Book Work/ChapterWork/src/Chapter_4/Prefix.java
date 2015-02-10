/*
Daniel Gail
Dec 8, 2014

Chapter 4
Code Listing 4-2
Page 195
*/

package Chapter_4;

/*
    This program demonstrates the ++ and -- operators
    in prefix mode.
*/
public class Prefix 
{
    public static void main (String [] args)
    {
        int number = 4; //  number starts out with 4
        
        //  Display the value in number.
        System.out.println("number is " + number);
        System.out.println("I will increment number.");
        
        //  Increment number.
        ++number;
        
        //  Display the value in number again.
        System.out.println("Now, number in " + number);
        System.out.println("I will decrement number.");
        
        //  Decrement number.
        --number;
        
        //  Display the value in number once again. 
        System.out.println("Now, number is " + number);
    }
}
