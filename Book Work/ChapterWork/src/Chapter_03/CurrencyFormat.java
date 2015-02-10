/*
Daniel Gail
Nov 25, 2014
Page 169
Code Listing 3-18

This program demonstrates how to use the System.out.printf
method to format a number as currency.
 */

package Chapter_03;

public class CurrencyFormat 
{
    public static void main(String[] args)
    {
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        System.out.printf("Your annual pay is $%,.2f\n", annualPay);
    }
}
