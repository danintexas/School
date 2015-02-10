/*
Daniel Gail
Oct 15, 2014

Chapter 3 Programming Challenges

Challenge #03              

Body Mass Index

Write a program that calculates and displays a person's body mass 
index (BMI). The BMI is often used to determine whether a person with 
a sedentary lifestyle is overweight or under-weight for his or her 
height. A person's BMI is calculated with the following formula:

BMI = weight x 703 / height(sq)

where weight is measured in pounds and height is measured in inches. 
The Program should display a message indicating wheather the person 
has optimal weight, is underweight, or is overweight. A sedentary 
person's weight is considered optimal if his or her BMI is between 
18.5 and 25. If the BMI is less than 18.5, the person is considered 
underweight. If the BMI value is greater than 25, the person is 
considered overweight.      
*/

package programming.challenges.Chapter_3;

import java.util.Scanner;

public class Challenge_3_03
{
   public static void main (String [] args)
   {
      double bmi, weight, height;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter your weight in pounds: ");
      weight = input.nextInt();
      
      System.out.print("\nPlease enter your height in inches: ");
      height = input.nextInt();
      
      bmi = (weight * 703) / (height * height);
      
      System.out.printf("\nYour current BMI is %.2f", bmi);
      
      if (bmi < 18.5)
      { 
         System.out.println(" \nYou are underweight");
      }
      
      else if (bmi > 25)
      {
         if (bmi < 40)
         {
            System.out.println("\nYou are overweight!");
         }
         
         else if (bmi >= 40)
         {
            System.out.println("\nYou are morbidly obese!!");
         }      
      }   
      
   }
}