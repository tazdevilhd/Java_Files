import java.util.Scanner;

/**
   This program calculates the geometric and
   harmonic progression for a number entered
   by the user.
*/

public class Progression
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.println("This program will calculate the " +
                         "geometric and harmonic progression " +
                         "for the number you enter.");
      System.out.print("Enter an integer that is greater than " +
                       "or equal to 1:  ");
      int input = keyboard.nextInt();

      int geomAnswer = geometricRecursive(input);
      double harmAnswer = harmonicRecursive(input);

      System.out.println("Using recursion:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);

      geomAnswer = geometricIterative(input);
      harmAnswer = harmonicIterative(input);

      System.out.println("Using iteration:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);
   }
   
   /**
      This is the geometricRecursive method.
      @param number The number input by the user.
      @return The geometric progression of number.
   */
   
   public static int geometricRecursive(int number)
   {
      if (number == 1)
         return 1;
      else
         return number * geometricRecursive(number - 1);
   }
   
   /**
      This is the harmonicRecursive method.
      @param number The number input by the user.
      @return The harmonic progression of number.
   */
   
   public static double harmonicRecursive(int number)
   {
      if (number == 1)
         return 1;
      else
         return 1.0 / number * harmonicRecursive(number - 1);
   }
   
   /**
      This is the geometricIterative method.
      @param number The number input by the user.
      @return The geometric progression of number.
   */
   
   public static int geometricIterative(int number)
   {
      int answer = 1;
      
      while (number > 1)
      {
         answer = answer * number;
         number--;
      }
      
      return answer;
   }
   
   /**
      This is the harmonicIterative method.
      @param number The number input by the user.
      @return The harmonic progression of number.
   */
   
   public static double harmonicIterative(int number)
   {
      double answer = 1;
      
      while (number > 1)
      {
         answer = answer / number;
         number--;
      }
      
      return answer;
   }
}