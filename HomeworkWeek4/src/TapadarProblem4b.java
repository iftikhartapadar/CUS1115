/* Author: Iftikhar Tapadar
   Date: 10/02/2019
   Section: 1115
   Homework Week 4
   TapadarProblem4b
*/
import java.util.Scanner;
public class TapadarProblem4b {
	
	public static void main (String[] args) {
		
		//Created input object that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter year and stores it into userYear variable
		System.out.println("Enter a year to verify its a leap year.");
		int userYear = input.nextInt();
		
		//Checks to see if userYear is evenly divisible by 4
		//AND Checks to see if userYear is NOT divisible by 100 OR is evenly divisible by 400
		if ((userYear % 4 == 0) && (userYear % 100 != 0) || (userYear % 400 == 0)) {
			//Prints the statement below if conditions above is true
			System.out.println(userYear + " is a leap year.");
		}
		else {
			//Print the statement below if the condition is false
			System.out.println(userYear + " is not a leap year.");
		}
		
		//Closes input Scanner method
		input.close();
	}

}
