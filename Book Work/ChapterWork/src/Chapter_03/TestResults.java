// Daniel Gail
// Sept 26, 2014
// Chapter 3 3-5 page 131

package Chapter_03;

import javax.swing.JOptionPane;

public class TestResults
{
   public static void main (String [] args)
   {
      int testScore;
      String input;
     
      input = JOptionPane.showInputDialog("Enter your numeric " +
            "test score and I will tell you the grade: ");
      testScore = Integer.parseInt(input);
      
      // Display the grade
      if (testScore < 60)
         JOptionPane.showMessageDialog(null, "Your grade is a F.");
      else if (testScore < 70)
         JOptionPane.showMessageDialog(null, "Your grade is a D.");
      else if (testScore < 80)
         JOptionPane.showMessageDialog(null, "Your grade is a C.");
      else if (testScore < 90)
         JOptionPane.showMessageDialog(null, "Your grade is a B.");
      else
         JOptionPane.showMessageDialog(null, "Your grade is an A.");
      
      System.exit(0);
   }
}                              