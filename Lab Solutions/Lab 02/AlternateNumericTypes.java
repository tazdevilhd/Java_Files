// ALTERNATE TASK #2
// Add import statement here to use the JOptionPane class
import javax.swing.JOptionPane;  // Needed for the JOptionPane class

/**
   This program demonstrates how numeric types and operators
   behave in Java. This is the alternate version.
*/

public class AlternateNumericTypes
{
   public static void main (String[] args)
   {
      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                  // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 Declare variables used here.
      String firstName;    // To hold the user's first name
      String lastName;     // To hold the user's last name
      String fullName;     // To hold the user's full name

      // TASK #3 Declare variables used here.
      char firstInitial;   // To hold the user's first initial
      char lastInitial;    // To hold the user's last initial

      // TASK #4 Declare variables used here.
      double diameter;     // To hold the diameter of a sphere
      double radius;       // To hold the radius of a sphere
      double volume;       // To hold the volume of a sphere

      // ALTERNATE TASK #2
      String input;        // To hold the user's input

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      JOptionPane.showMessageDialog(null, output);

      // Convert Fahrenheit temperatures to Celsius.
      fToC = 5 / (double) 9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";

      // ALTERNATE TASK #2 Display output in a message dialog.
      JOptionPane.showMessageDialog(null, output);

      // ADD LINES FOR ALTERNATE TASK #2 HERE
      // Get the user's first name.
      firstName = JOptionPane.showInputDialog(
                  "Enter your first name.");

      // Get the user's last name.
      lastName = JOptionPane.showInputDialog(
                 "Enter your last name.");

      // Concatenate the user's first and last names.
      fullName = firstName + " " + lastName;

      // Display the user's full name.
      JOptionPane.showMessageDialog(null, fullName);

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name.
      firstInitial = firstName.charAt(0);
      lastInitial = lastName.charAt(0);

      // ALTERNATE TASK #2 Display the user's initials in a
      // message dialog.
      JOptionPane.showMessageDialog(null, firstInitial +
                                    "" + lastInitial);

      // Convert the user's full name to uppercase.
      fullName = fullName.toUpperCase();

      // ALTERNATE TASK #2 Display the user's full name in
      // uppercase in a message dialog.
      JOptionPane.showMessageDialog(null, fullName  + " has " +
                                    fullName.length() +
                                    " characters");

      // ADD LINES FOR TASK #4 HERE
      // ALTERNATE TASK #2 Get the diameter using an input dialog.
      input = JOptionPane.showInputDialog(
              "Enter the diameter of a sphere.");

      // Convert the user's input to a double.
      diameter = Double.parseDouble(input);

      // Calculate the radius.
      radius = diameter / 2;

      // Calculate the volume.
      volume = 4 / (double) 3 * Math.PI * Math.pow(radius, 3);

      // ALTERNATE TASK #2 Display the volume in a message dialog.
      JOptionPane.showMessageDialog(null,
                                    "The volume of the sphere is " +
                                    volume);

      // ALTERNATE TASK #2 End the program.
      System.exit(0);
   }
}