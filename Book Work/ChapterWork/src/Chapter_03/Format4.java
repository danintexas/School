////////////////////////////////////////////////////
// Daniel Gail
// Sept 30, 2014
//
// Chapter 3 Page 163 - 164
////////////////////////////////////////////////////

package Chapter_03;

import java.text.DecimalFormat;

public class Format4
{
   public static void main (String [] args)
   {
      double number1 = 0.12;
      double number2 = 0.05;
      
      DecimalFormat formatter = new DecimalFormat("#0%");
      
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
   }
}      