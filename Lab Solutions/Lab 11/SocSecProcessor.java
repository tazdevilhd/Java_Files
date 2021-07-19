import java.util.Scanner;

/**
   This program tests the SocSecException 
   exception class.
*/

public class SocSecProcessor
{
	public static void main (String[] args)
	{	
		Scanner keyboard = new Scanner (System.in);
		String name;
		String socSecNumber;
		String response;
		char answer = 'Y';
		
		while (Character.toUpperCase(answer) == 'Y')
		{
			try
			{
				System.out.print("Name?  ");
				name = keyboard.nextLine();
				System.out.print("SSN?   ");
				socSecNumber = keyboard.nextLine();
				if (isValid(socSecNumber))
				{ 	
					System.out.println(name + " " + socSecNumber + 
                                  " is valid");
				}
			}
			catch (SocSecException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.print("Continue?  ");
			response = keyboard.nextLine();
			answer = response.charAt(0);
		}
	}
   
   /**
      The isValid method determines if a social 
      security number is valid.
      @param number The social security number.
      @return True if the social security number 
              is valid, false otherwise.
   */
   
	private static boolean isValid(String number)throws SocSecException
	{
		boolean goodSoFar = true;
		int index = 0;
		
		if (number.length() != 11)
		{
			throw new SocSecException("wrong number of characters ");
		}
		
		while (goodSoFar && index < 11)
		{
			if (index == 3 || index == 6)
			{
				if (number.charAt(3) != '-' || number.charAt(6) != '-' )
				{
					throw new SocSecException("dashes at wrong positions");
				}
			}
			else if (!Character.isDigit(number.charAt(index)))
			{
				throw new SocSecException (
					"contains a character that is not a digit ");
			}
			index++;
		}
		return goodSoFar;
	}
}