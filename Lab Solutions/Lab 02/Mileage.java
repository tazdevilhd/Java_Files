import java.util.Scanner;  // Needed for the Scanner class

/**
   This program calculates mileage.
   Diane Christie
   August 12, 2016
*/

public class Mileage
{
   public static void main (String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      double miles;     // Miles driven
      double gallons;   // Gallons of gas used
      double mileage;   // Miles per gallon calculated

      // Prompt the user and read input
      System.out.println("This program calculates mileage");
      System.out.print("Enter the miles driven: ");
      miles = keyboard.nextDouble();
      System.out.print("Enter the gallons used: ");
      gallons = keyboard.nextDouble();

      // Calculate MPG = miles divided by gallons
      mileage = miles / gallons;

      // Display the results
      System.out.println(mileage + " miles per gallon");
   }
}