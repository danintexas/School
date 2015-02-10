/*
Daniel Gail
Feb 1, 2015

Chapter 8
Code Listing 8-21
Page 473
*/

package Chapter_08;

/**
 * This program displays the arguments passed to
 * it from the operating system command line.
 */

// This has to be run through a command line.

public class CommandLine 
{
    public static void main(String[] args)
    {
        for (int index = 0; index < args.length; index++)
            System.out.println(args[index]);
    }
}
