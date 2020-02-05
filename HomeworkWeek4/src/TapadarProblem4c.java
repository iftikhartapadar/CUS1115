/* Author: Iftikhar Tapadar
   Date: 10/02/2019
   Section: 1115
   Homework Week 4
   TapadarProblem4c
*/
import java.util.Scanner;
public class TapadarProblem4c {

	public static void main (String[] args) {
		
		//Gets current time in milliseconds
		long startTime = System.currentTimeMillis();
		
		//Created input object that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user for first name and stores it into firstName variable
		System.out.println("Please enter your first name.");
		String firstName = input.nextLine();
		
		//Prompts user for last name and stores it into lastName variable
		System.out.println("Please enter your last name.");
		String lastName = input.nextLine();
		
		//Receives current time that represents when name has finished being entered in milliseconds
		long endTime = System.currentTimeMillis();
		
		//Computes the difference in time that has elapsed in milliseconds 
		long timeDifference = endTime - startTime;
		
		//Computation to convert time elapsed in milliseconds to seconds
		timeDifference = timeDifference / 1000;
		
		//Displays results
		System.out.println("Your first name is: " + firstName);
		System.out.println("Your last name is: " + lastName);
		System.out.println("It took " + timeDifference + " seconds to get your first and last name.");
		
		//Closes Scanner method
		input.close();
		
	}
}
