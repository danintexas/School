// Daniel Gail
// Sept 26, 2014
// Page 113 - Code Listing 3-1

package Chapter_3;

import javax.swing.JOptionPane;

/**
   This program demonstrates the if statement
*/

public class AverageScore
{
   public static void main (String [] args)
   {
      double score1, score2, score3, average;
      String input;
      
      input = JOptionPane.showInputDialog("Enter score #1");
      score1 = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter score #2");
      score2 = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter score #3");
      score3 = Double.parseDouble(input);
      
      average = (score1 + score2 + score3) / 3.0;
      
      JOptionPane.showMessageDialog(null,
            "The average is " + (int)average);
            
      if (average > 95)
         JOptionPane.showMessageDialog(null,
            "That's a great score!");
            
      System.exit(0);               
   }
}      