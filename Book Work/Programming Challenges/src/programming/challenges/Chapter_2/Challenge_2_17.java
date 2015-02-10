/////////////////////////////////////////////////////////////////
// Daniel Gail
// Sept 24, 2014
// Chapter 2 Challenge 17
//
// Joe bought stock and sold them at a later date
// Bought - 1000 shares for $32.87 a share
// Sold - 1000 shares for $33.92 a share
// The commision to his broker was 2% for each activity
//
// Program is to list out what Joe paid - what he sold for
// Program is to list the commission paid for each trasnaction
// program is to list the profit to Joe after selling
/////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

public class Challenge_2_17
{
   public static void main (String [] args)
   {
      // Set up all the variables I need
      double buy = 32.87, sell = 33.92, broker = .02;
      double numberBought = 1000, numberSold = 1000;
      double totalBuy = buy * numberBought, totalSell = sell * numberSold;
      double brokerBuy = totalBuy * broker, brokerSell = totalSell * broker;
      double brokerTotal = brokerBuy + brokerSell;
      double profit = (totalSell - totalBuy) - brokerTotal;
      
      System.out.print("Joe bought " + (int) numberBought + " shares at $" +
         buy + " a share for a total of: $");
      System.out.format("%.2f%n", totalBuy);  
       
      System.out.print("\nHis stock brokers commission was: $");
      System.out.format("%.2f%n", brokerBuy);
      
      System.out.print("\nJoe then turned around and sold " + numberSold +
         " shares for $" + sell + " a share for\na total of: $");
      System.out.format("%.2f%n", totalSell);
      
      System.out.print("\nHis broker then got a commission of: $");
      System.out.format("%.2f%n", brokerSell);
      
      System.out.print("\nWhen all was finished Joe made a profit of $");
      System.out.format("%.2f%n", profit);
      
      System.out.print("\nWhile his broker made a profit of $");
      System.out.format("%.2f%n", brokerTotal);  
      
      System.out.println("\nMoral of the story? Be a broker!");
   }
}