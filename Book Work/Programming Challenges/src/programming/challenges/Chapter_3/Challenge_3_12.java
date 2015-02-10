/*
Daniel Gail
Dec 8, 2014

Chapter 3 
Programming Challenge 12
Page 190 - 191

Takes user input on distance and calculates the amount of time sound
takes to travel that distance when going through air, water, or steel.
*/ 
package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_12 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        int distance, time;
        String choice;
        
        System.out.println("Please enter the distance in feet " +
                        "the sound is traveling: ");
        distance = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Please enter what the sound is travelling" +
                        " through. (Air, Water, Steel)");
        choice = input.nextLine();
        
        if (choice.contains("Air") || choice.contains("air"))
        {
          time = distance / 1100;
          
          System.out.println("The total time in seconds the sound " + 
                        "traveled is: " + time);
        }
        
        else if (choice.contains("Water") || choice.contains("water"))
        {
          time = distance / 4900;
          
          System.out.println("The total time in seconds the sound " + 
                        "traveled is: " + time);
        }
        
        else if (choice.contains("Steel") || choice.contains("steel"))
        {
          time = distance / 16400;
          
          System.out.println("The total time in seconds the sound " + 
                        "traveled is: " + time);
        }
        
        else
        {
            System.out.println("Chad is poop");
        }
    }
}