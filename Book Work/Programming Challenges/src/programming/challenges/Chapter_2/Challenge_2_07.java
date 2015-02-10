// Daniel Gail
// Sept 23, 2014
// Chapter 2 Challenge 07

// Calculate the number of acres in a tract of land
// 1 acre = 43,560 square feet

package programming.challenges.Chapter_2;

public class Challenge_2_07
{
   public static void main (String [] args)
   {
      float acre = 43560, landSize = 389767, value;
      
      value = landSize / acre;
      
      System.out.print("The size of the property is: " + (int) landSize + "\nThe number of " + 
         "acres in this property is: " + value);   
      
   }
}      