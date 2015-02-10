// Daniel Gail
// Sept 28, 2014
// Chapter 3 Page 144 - 145

package Chapter_3;

public class StringCompare
{ 
   public static void main(String [] args)
   {
      String name1 = "Mark",
             name2 = "Mark",
             name3 = "Mary";
      
      // Compare "Mark" and "Mary"
      
      if (name1.equals(name2))
      {
         System.out.println(name1 + " and " + name2 +
               " are the same.");
      }
      else
      {  
         System.out.println(name1 + " and " + name2 +          
               " are NOT the same.");
      }
      
      // Compare Mark and Mary
      
      if (name1.equals(name3))
      {
         System.out.println(name1 + " and " + name3 +
               " are the same.");
      }
      else 
      {
         System.out.println(name1 + " and " + name3 +
               " are NOT the same.");
      }
   }
}              