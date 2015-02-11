// Daniel Gail
// Jan 26, 2014
// COSC 1437 
// Week 1 assignment

// Simple Rock, paper, scissors game using methods


import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors 
{
    public static void main(String[] args)
    {
        int winner = 0;
        
        do
        {
            /* 
            min & max are range limits for the computer's random selection
            number is the return value of the user's selection
            */
            int min = 1, max = 3, number = 0;
            int comp = computerChoice(min, max); // Comp choice
            int user = userChoice(number);       // User choice
        
            if (comp == 1) // Computer selected Rock
            {
                winner = rock(user, winner);  
            }
            else if (comp == 2) // Computer selected Paper
            {
                winner = paper(user, winner);
            }
            else // Computer selected Scissors 
            {
                winner = scissors(user, winner);
            }
        } 
        while (winner == 0);
    }
    
    // Method to generate the computer's move
    public static int computerChoice (int min, int max)
    {
        Random rand = new Random();
        
        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        return randomNum;
    }
    
    // Method to get the user's move
    public static int userChoice (int number)
    {
        System.out.println("Let's play a game....");
        
        while (number < 1 || number > 3)
        {
            System.out.println("\nPlease make a selection from the list below:");
            System.out.println("1) Rock");
            System.out.println("2) Paper");
            System.out.println("3) Scissors");
        
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            
            if (number < 1 || number > 3) // Checks user input is within range
            {
                System.out.println("\nThat is outside the choices alowed.");
            }
        }               
        return number;
    }
    
    // Method if computer selected Rock
    public static int rock (int user, int winner)
    {
        if (user == 1)
        {
            System.out.println("The computer selected rock and you " +
                "selected rock.\nTIE GAME!\nLet's do that again!");
        }
        else if (user == 2)
        {
            System.out.println("The computer selected rock and" +
            " you selected paper.\n*YOU WIN!*");
            winner = 1;
        }
        else 
        {
            System.out.println("The computer selected rock and you " +
                "selected scissors.\n**COMPUTER WINS!**");
            winner = 1;
        }
        return winner;
    }
    
    // Method if computer selected Paper
    public static int paper (int user, int winner)
    {
        if (user == 1)
        {
            System.out.println("The computer selected paper and you " +
            "selected rock.\n**COMPUTER WINS!**");
            winner = 1;
        }
        else if (user == 2)
        {
            System.out.println("The computer selected paper and you" +
            " selected paper.\nTIE GAME!\nLet's do that again!");
            }
        else 
        {
            System.out.println("The computer selected paper and you " +
                "selected scissors.\n**YOU WIN!**");
            winner = 1;
        }
        return winner;
    }
    
    // Method if computer selected Scissors
    public static int scissors (int user, int winner)
    {
        if (user == 1)
        {
            System.out.println("The computer selected scissors and " +
                "you selected rock.\n**YOU WIN!**");
            winner = 1;
        }
        else if (user == 2)
        {
            System.out.println("The computer selected scissors and " +
                "you selected paper.\n**COMPUTER WINS!**");
            winner = 1;
        }
        else 
        {
            System.out.println("The computer selected scissors and " +
                "you selected scissors.\nTIE GAME!" +
                "\nLet's do that again!");
        }
        return winner;
    }
}
