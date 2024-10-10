/*Class: CMSC203 CRN 22557
 Program: Lab 1
 Instructor: David Kuijt
 Summary of Description: Using different classes to ask user movie information
 Due Date: 09/24/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Print your Name here: Arianna Alimi
*/

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) 
	{
		try (Scanner keyboard = new Scanner (System.in)) {
			String userChoice;
			
			do 
			{
				
			
				System.out.println("Enter the name of a movie");
				String TITLE = keyboard.nextLine();

			
			
				System.out.println("Enter the rating of the movie");
				String RATING = keyboard.nextLine();
			
			

				System.out.println("Enter the number of tickets sold for this movie");
				int TICKETS = keyboard.nextInt();
				
				keyboard.nextLine();

				Movie movieObject = new Movie (TITLE, RATING, TICKETS);
				System.out.println(movieObject.toString());
				
				System.out.println("Do you want to enter another? (y or n)");
				userChoice = keyboard.nextLine();
			
			}
			while (userChoice.equals("y"));
		}
		
		System.out.println("GoodBye");
		

	}
}
	
