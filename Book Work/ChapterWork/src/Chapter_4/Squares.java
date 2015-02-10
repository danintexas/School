/*
    Daniel Gail
    Dec 8, 2014

    Chapter 4
    Code Listing 4-7
    Page 213
*/

package Chapter_4;

/*
    This program demonstrates the for loop.
*/
public class Squares 
{
    public static void main (String [] args)
    {
        int number; //  Loop control variable
        
        System.out.println("Number Number Squared");
        System.out.println("=========================");
        
        for (number = 1; number <= 10; number++)
        {
            System.out.println(number + "\t\t" +
                    number * number);
        }
    }
}
