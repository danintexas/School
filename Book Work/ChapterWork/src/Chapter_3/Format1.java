////////////////////////////////////////////////////
// Daniel Gail
// Sept 30, 2014
//
// Chapter 3 Page 161
////////////////////////////////////////////////////

package Chapter_3;

import java.text.DecimalFormat;

public class Format1
{
   public static void main (String [] args)
   {
      double number1 = 0.166666666666667;
      double number2 = 1.666666666666667;
      double number3 = 16.66666666666667;
      double number4 = 166.6666666666667;
      
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
      
   }
}      