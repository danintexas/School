//////////////////////////////////////////////////////////////////////
// Daniel Gail
// Sept 24, 2014
// Chapter 2 Challenge 15
//
// 12,467 people were surveyed who drink energy drinks
// 14% were found to drink one every week
// 64% preferred citris flavored drinks
//
// Program will list the above to a command prompt
//////////////////////////////////////////////////////////////////////

package programming.challenges.Chapter_2;

public class Challenge_2_15
{
   public static void main (String [] args)
   {
      double total = 12467, aWeek = total * .14, citris = total * .64;
      
      System.out.println("The total number of people surveyed was: " + (int)total);
      System.out.println("\nOf those people " + (int) aWeek + " had a drink at " +
         "least once a week.");
      System.out.print("The surprizing find was that " + (int) citris +
         " prefered a citris flavored drink.\nWhich accounts for a wopping " +
         "64%!");    
   }
}              