/*
Daniel Gail
Dec 8, 2014

Chapter 3
Programming Challenge 16

Program will calculate how many points a user gets for purchased books from
a bookstore.
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_16
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
    
        int books;
    
        System.out.print("Please enter in the number of books you " + 
            "have bought: ");
        books = input.nextInt();
        
        switch (books)
        {
            case 0:
                System.out.println("Books bought: 0\t\tPoints Earned: 0");
                break;
            case 1:
                System.out.println("Books bought: 1\t\tPoints Earned: 5");
                break;
            case 2:
                System.out.println("Books bought: 2\t\tPoints Earned: 15");
                break;
            case 3:
                System.out.println("Books bought: 3\t\tPoints Earned: 30");
                break;
            default:
                System.out.println("Books bought: " + books + 
                        "\t\tPoints Earned: 60");
                break;
        }
    }
}