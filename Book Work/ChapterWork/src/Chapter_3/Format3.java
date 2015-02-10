////////////////////////////////////////////////////
// Daniel Gail
// Sept 30, 2014
// 
// Chapter 3 Page 162 - 163
////////////////////////////////////////////////////

package Chapter_3;

import java.text.DecimalFormat;

public class Format3
{
   public static void main (String [] args)
   {  
      double number1 = 123.899;
      double number2 = 1233.899;
      double number3 = 12345.899;
      double number4 = 123456.899;
      double number5 = 1234567.899;
      
      DecimalFormat formatter = new DecimalFormat("#,##0.00");
      
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
      System.out.println(formatter.format(number5));
   }
}      