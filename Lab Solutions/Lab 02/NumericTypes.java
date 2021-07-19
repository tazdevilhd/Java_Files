// TASK #2
// Add import statement here to use the Scanner class
import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String[] args)
   {
      // TASK #2 Create a Scanner object here.
      Scanner keyboard = new Scanner (System.in);

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                  // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 Declare variables used here
      String firstName;    // To hold the user's first name
      String lastName;     // To hold the user's last name
      String fullName;     // To hold the user's full name

      // TASK #3 Declare variables used here
      char firstInitial;   // To hold the user's first initial
      char lastInitial;    // To hold the user's last initial

      // TASK #4 Declare variables used here
      double diameter;     // To hold the diameter of a sphere
      double radius;       // To hold the radius of a sphere
      double volume;       // To hold the volume of a sphere

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperatures to Celsius.
      fToC = 5 / (double) 9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name.
      System.out.print("Enter your first name:  ");
      // Read the user's first name.
      firstName = keyboard.nextLine();
      
      // Prompt the user for last name.
      System.out.print("Enter your last name:  ");
      // Read the user's last name.
      lastName = keyboard.nextLine();
      
      // Concatenate the user's first and last names.
      fullName = firstName + " " + lastName;
      
      // Print out the user's full name.
      System.out.println(fullName);

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name.
      firstInitial = firstName.charAt(0);
      
      // Get the first character from the user's last name.
      lastInitial = lastName.charAt(0);
      
      // Print out the user's initials.
      System.out.print(firstInitial);
      System.out.println(lastInitial);
      
      // Convert the user's full name to uppercase.
      fullName = fullName.toUpperCase();
      
      // Print out the user's full name in uppercase.
      System.out.println(fullName + " has " +
                         fullName.length() + " characters");

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere.
      System.out.print("Enter the diameter of a sphere: ");
      
      // Read the diameter.
      diameter = keyboard.nextDouble();
      
      // Calculate the radius.
      radius = diameter / 2;
      
      // Calculate the volume.
      volume = 4 / (double) 3 * Math.PI * Math.pow(radius, 3);
      
      // Print out the volume.
      System.out.println("The volume of the sphere is " + volume);
   }
}