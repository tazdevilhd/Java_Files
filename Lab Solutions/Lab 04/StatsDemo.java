import java.util.Scanner;
import java.io.*;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // Create a FileReader object passing it the filename
      FileReader freader = new FileReader(filename);

      // Create a BufferedReader object passing it
      // the FileReader object
      BufferedReader input = new BufferedReader(freader);

      // Priming read to read the first line of the file
      line = input.readLine();

      // Loop that continues until you are at the
      // end of the file
      while (line != null)
      {
         // Convert the line into a double value and
         // add the value to the sum
         sum += Double.parseDouble(line);

         // Increment the counter
         count++;

         // Read a new line from the file
         line = input.readLine();
      }

      // Close the input file
      input.close();

      // Store the calculated mean
      mean = sum/count;

      // Reconnect to the FileReader object passing it
      // the filename
      freader = new FileReader(filename);

      // Reconnect to the BufferedReader object passing it
      // the FileReader object
      input = new BufferedReader(freader);

      sum = 0;    // Reinitialize the sum
      count = 0;  // Reinitialize total numbers added

      // Priming read to read the first line of the file
      line = input.readLine();

      // Loop that continues until you are at the end of
      // the file
      while (line != null)
      {
         // Convert the line into a double value and
         // subtract the mean
         difference = Double.parseDouble(line) - mean;

         // Add the square of the difference to the sum
         sum += Math.pow(difference, 2);

         // Increment the counter
         count++;

         // Read a new line from the file
         line = input.readLine();
      }

      // Close the input file
      input.close();

      // Store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);

      // Create an object of type FileWriter using
      // "Results.txt"
      FileWriter fwriter = new FileWriter("Results.txt");

      // Create an object of PrintWriter passing it the
      // FileWriter object
      PrintWriter output = new PrintWriter(fwriter);

      // Print the results to the output file
      output.printf("mean = %.3f\r\n", mean);
      output.printf("standard deviation = %.3f", stdDev);

      // Close the output file
      output.close();
   }
}