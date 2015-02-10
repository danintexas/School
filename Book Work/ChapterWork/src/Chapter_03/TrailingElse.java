// Daniel Gail
// Sept 26, 2014 - Finished up on Nov 24, 2014 
// Chapter 3 3-6 Page 133

package Chapter_03;

import javax.swing.JOptionPane;


public class TrailingElse
{
   public static void main (String [] args)
   {
      int testScore; // Numeric test score
      String input; //To hold the user's input
      
      input = JOptionPane.showInputDialog("Enter your numeric " +
            "test score and I will tell you the grade: ");
      testScore = Integer.parseInt(input);      
      
      if (testScore < 60)
         JOptionPane.showMessageDialog(null, "Your grade is F.");
      else if (testScore < 70)
         JOptionPane.showMessageDialog(null, "Your graded is D."); 
      else if (testScore < 80)
          JOptionPane.showMessageDialog(null, "Your grade is C.");
      else if (testScore < 90)
          JOptionPane.showMessageDialog(null, "Your grade is B.");
      else if (testScore <= 100)
          JOptionPane.showMessageDialog(null, "Your grade is A.");
      else 
          JOptionPane.showMessageDialog(null, "Invalid score");
      
      System.exit(0);
   }
}