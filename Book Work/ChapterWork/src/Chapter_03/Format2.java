////////////////////////////////////////////////////
// Daniel Gail
// Sept 30, 2014
//
// Chapter 3 Page 162
////////////////////////////////////////////////////

package Chapter_03;

import java.text.DecimalFormat;

public class Format2
{
   public static void main (String [] args)
   {
      double number1 = 0.16666666666666667;
      double number2 = 1.66666666666666667;
      double number3 = 16.6666666666666667;
      double number4 = 166.666666666666667;
      
      DecimalFormat formatter = new DecimalFormat("000.00");
      
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
   }
}      