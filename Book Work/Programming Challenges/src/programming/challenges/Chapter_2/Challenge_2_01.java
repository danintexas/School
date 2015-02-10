/* 
Daniel Gail
Sept 22, 2014
Chapter 2 Challenge #1
Set up three variables with my name, age, desired income - 
and output all on the screen
*/

package programming.challenges.Chapter_2;

public class Challenge_2_01 
{
    public static void main(String [] args)
    {
      // Setting up all the variables      
      String name;
      int age;
      double annualPay;
      
      // Assigning all literals      
      name = "Daniel Gail";
      age = 39;
      annualPay = 75000;
      
      // Printing out all the variables
      System.out.println("My name is " + name + " and I am " + age +
                ". \n\nMy goal is in the next 2 years I will be making $" + 
                annualPay + " a year! \n\nI CAN DO THIS!");
    }
}

