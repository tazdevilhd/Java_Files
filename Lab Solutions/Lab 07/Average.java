import java.util.Scanner;

/**
   This class will allow a user to enter 5 scores into an
   array. It will then rearrange the data in descending
   order and calculate the mean for the data set.
*/

public class Average
{
   private int[] data;  // Array of scores
   private double mean; // Average of scores

   /**
      Constructor
   */

   public Average()
   {
      data = new int[5];

      Scanner keyboard = new Scanner(System.in);

      for (int i = 0; i < data.length; i++)
      {
         System.out.print("Enter score number " +
                          (i + 1) + ": ");
         data[i] = keyboard.nextInt();
      }

      selectionSort();
      calculateMean();
   }

   /**
      The selectionSort method
   */

   public void selectionSort()
   {
      int maxIndex;
      int maxValue;

      for (int startScan = 0;
           startScan < data.length - 1;
           startScan++)
      {
         maxIndex = startScan;
         maxValue = data[startScan];

         for (int index = startScan + 1;
              index < data.length;
              index++)
         {
            if (data[index] > maxValue)
            {
               maxValue = data[index];
               maxIndex = index;
            }
         }

         data[maxIndex] = data[startScan];
         data[startScan] = maxValue;
      }
   }

   /**
      The calculateMean method
   */

   public void calculateMean()
   {
      int total = 0;

      for (int i = 0; i < data.length; i++)
      {
         total = total + data[i];
      }

      mean = total/data.length;
   }

   /**
      The toString method
      @return A String representing the Average class.
   */

   public String toString()
   {
      String output = "The test scores in " +
                      "descending order are \n";

      for (int i = 0; i < data.length; i++)
      {
         output = output + data[i] + "     ";
      }

      output = output + "\nThe average is " + mean;

      return output;
   }
}