/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: User guesses what color the program is thinking
 * Due: 09/10/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Arianna Alimi
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{

	public static void main(String[] args) 
	{

		try (Scanner scan = new Scanner(System.in))
		{
			Random randomColors = new Random();
		
			//Variable List
			final String RED = "Red";
			final String GREEN = "Green";
			final String BLUE = "Blue";
			final String ORANGE = "Orange";
			final String YELLOW = "Yellow";
			final String PINK = "Pink";
			final String PURPLE = "Purple";
			int POINTS = 0;
			String userGuess;
		
			System.out.print("Enter your name: ");
			String userName = scan.nextLine();
		
			System.out.print("Enter your MC M#: ");
			String userNumber = scan.nextLine();
		
			System.out.print("Describe yourself: ");
			String userDescription = scan.nextLine();
		
			System.out.print("Due Date: ");
			String userDueDate = scan.nextLine();
		
			System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		
			//Run for 10 rounds
			for (int a = 1; a <= 10; a++)
			{
				System.out.println("Round " + a);
				System.out.println(" ");
			
				//Random Color Generator
				int int_random = randomColors.nextInt(6);
			
				System.out.println("I am thinking of a color.");
				System.out.println("Is it Red, Green, Blue, Orange, Yellow, Pink, or Purple?");
				System.out.println("Enter your guess:");
				userGuess = scan.nextLine();
			
			
				//Input Validation: Making sure user has put one of the 7 colors
				while (!((userGuess.equalsIgnoreCase(RED)) || (userGuess.equalsIgnoreCase(GREEN)) || (userGuess.equalsIgnoreCase(BLUE)) || (userGuess.equalsIgnoreCase(ORANGE)) || (userGuess.equalsIgnoreCase(YELLOW)) || (userGuess.equalsIgnoreCase(PINK)) || (userGuess.equalsIgnoreCase(PURPLE))))
				{
					System.out.println("You entered an incorrect color. Is it Red, Green, Blue, Orange, Yellow, Pink, or Purple?");
					System.out.println("Enter your guess again:");
					userGuess = scan.nextLine();
				}
			
			
				//Output random generator guess
				if (int_random == 0)
				{
					System.out.println("I was thinking Red.");
				}
			
				if (int_random == 1)
				{
					System.out.println("I was thinking Green.");
				}
			
				if (int_random == 2)
				{
					System.out.println("I was thinking Blue.");
				}
			
				if (int_random == 3)
				{
					System.out.println("I was thinking Orange.");
				}
			
				if (int_random == 4)
				{
					System.out.println("I was thinking Yellow.");
				}
			
				if (int_random == 5)
				{
					System.out.println("I was thinking Pink.");
				}
			
				if (int_random == 6)
				{
					System.out.println("I was thinking Purple.");
				}
			
			
				//Starting here: Add score by 1 if user got color correct
				if (int_random == 0 && userGuess.equalsIgnoreCase(RED))
				{
					POINTS+= 1;
				}
			
				if (int_random == 1 && userGuess.equalsIgnoreCase(GREEN))
				{
					POINTS+= 1;
				}
				
				if (int_random == 2 && userGuess.equalsIgnoreCase(BLUE))
				{
					POINTS+= 1;
				}
			
				if (int_random == 3 && userGuess.equalsIgnoreCase(ORANGE))
				{
					POINTS+= 1;
				}
			
				if (int_random == 4 && userGuess.equalsIgnoreCase(YELLOW))
				{
					POINTS+= 1;
				}
			
				if (int_random == 5 && userGuess.equalsIgnoreCase(PINK))
				{
					POINTS+= 1;
				}
			
				if (int_random == 6 && userGuess.equalsIgnoreCase(PURPLE))
				{
				POINTS+= 1;
				}
			}
		
		
			System.out.println("Game Over");
		
			System.out.println();
			System.out.print("You guessed ");
			System.out.print(POINTS);
			System.out.println(" out of 10 colors correctly.");
		
			System.out.print("User Name: ");
			System.out.print(userName);
			System.out.println();
		
			System.out.print("User MC M#: ");
			System.out.print(userNumber);
			System.out.println();
		
			System.out.print("User Description: ");
			System.out.print(userDescription);
			System.out.println();
		
			System.out.print("Due Date: ");
			System.out.print(userDueDate);
			System.out.println();
			
			scan.close();
			
		}
	
	}
}


