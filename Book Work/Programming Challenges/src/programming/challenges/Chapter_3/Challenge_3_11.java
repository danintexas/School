///////////////////////////////////////////////////////////////////////////////
// Daniel Gail
// Oct 23, 2014
//
// Chapter 3 Programming Challenges
//
// Challenge # 11   
//
// Running the Race
//
// Write a program that asks for the names of three runners and the time, in 
// minutes, it took each of them to finish a race. The program should display 
// the names of the runners in the order that they finished.     
//                
///////////////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_11 {
   public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      
      String runner1, runner2, runner3;
      int runTime1, runTime2, runTime3;
      
      System.out.print("Please enter in the name of the first runner: ");
      runner1 = input.nextLine();
      System.out.print("Please enter the first runner's run time in min: ");
      runTime1 = input.nextInt();
      
      input.nextLine(); // Consume newline left-over
      
      System.out.print("Please enter in the name of the second runner: ");
      runner2 = input.nextLine();
      System.out.print("Please enter the second runner's run time in min: ");
      runTime2 = input.nextInt();
      
      input.nextLine(); // Consume newline left-over      
            
      System.out.print("Please enter in the name of the third runner: ");
      runner3 = input.nextLine();
      System.out.print("Please enter the third runner's run time in min: ");
      runTime3 = input.nextInt();
      
      System.out.println();   // Space out the race results
      
      // Should be noted I am not happy with the below
      // What happens if there is a tie? 
      
      if (runTime1 < runTime2) {
         if (runTime1 < runTime3) {  
            if (runTime2 < runTime3) {
               System.out.println("First place was: " + runner1);
               System.out.println("Second place was: " + runner2);
               System.out.println("Third place was: " + runner3); 
            }
            
            else {
               System.out.println("First place was: " + runner1);
               System.out.println("Second place was: " + runner3);
               System.out.println("Third place was: " + runner2);
            } 
         }
         
         else {
            System.out.println("First place was: " + runner3);
            System.out.println("Second place was: " + runner1);
            System.out.println("Third place was: " + runner2);
         }
      }
      
      else {
         if (runTime2 < runTime3) {
            if (runTime1 < runTime3) {
               System.out.println("First place was: " + runner2);
               System.out.println("Second place was: " + runner1);
               System.out.println("Third place was: " + runner3);  
            }
            
            else {
               System.out.println("First place was: " + runner2);
               System.out.println("Second place was: " + runner3);
               System.out.println("Third place was: " + runner1);
            }
         }
         
         else {
            System.out.println("First place was: " + runner3);
            System.out.println("Second place was: " + runner2);
            System.out.println("Third place was: " + runner1); 
         }
      }
   }
}                     