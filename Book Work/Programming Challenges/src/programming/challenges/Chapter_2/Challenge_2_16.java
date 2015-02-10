//////////////////////////////////////////////////////////////////////
// Daniel Gail
// Sept 24,2014
// Chapter 2 Challenge 16
//
// Word game to ask the user for the following:
// Name, age, city, college, profession, animal, pet's name
// Then the program will output a fun text using all the above
//////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

import java.util.Scanner;

public class Challenge_2_16
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      // Sets up all the variables that will be needed
      String name, age, city, college, profession, animal, petName;
      
      System.out.print("Please enter in your name: ");
      name = input.nextLine();
      System.out.print("\nPlease enter in your age: ");
      age = input.nextLine();
      System.out.print("\nPlease enter in your hometown: ");
      city = input.nextLine();
      System.out.print("\nPlease enter in the college you are attending: ");
      college = input.nextLine();
      System.out.print("\nWhat is your current profession: ");
      profession = input.nextLine();
      System.out.print("\nWhat is your favorite kind of pet: ");
      animal = input.nextLine();
      System.out.print("\nLastly what is your pet's name: ");
      petName = input.nextLine(); 
      
      System.out.print("\n\nThere once was a person named " + name +
         " who lived in " + city + ". \nAt the age of " + age + 
         ", " + name + " went to college at " + college + ". \n" + 
         name + " graduated and went to work as a " + profession + 
         ". \nThen, " + name + " adopted a(n) " + animal + " named " +
         petName + ". \nThey both lived happily ever after!");
   }
}         