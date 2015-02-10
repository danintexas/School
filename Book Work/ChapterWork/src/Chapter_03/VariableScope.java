///////////////////////////////////////////////
// Daniel Gail
// Sept 28, 2014
//
// Chapter 3 Page 149 - 150
///////////////////////////////////////////////

package Chapter_03;

import javax.swing.JOptionPane;

public class VariableScope
{
   public static void main(String [] args)
   {
      String firstName;
      firstName = JOptionPane.showInputDialog("Enter your " +
                     "first name.");
      
      String lastName;
      lastName = JOptionPane.showInputDialog("Enter your " +
                     "last name.");
                     
      JOptionPane.showMessageDialog(null, "Hello " + firstName +     
                     " " + lastName);
                     
      System.exit(0);
   }
}                                                         