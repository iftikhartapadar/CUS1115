/* Author: Iftikhar Tapadar
   Date: 10/02/2019
   Section: 1115
   Homework Week 4
   TapadarProblem4a
*/
import java.util.Scanner;
public class TapadarProblem4a {
	
	public static void main (String[] args) {
		
		//Created input object that uses scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter a number and stores it into userNumber variable
		System.out.print("Please enter a number: ");
		int userNumber = input.nextInt();
		
		if ((userNumber % 3 == 0) && (userNumber % 4 == 0)) {
			//If the number is divisible by both 3 and 4, it will print this statement
			System.out.println("The number is evenly divisible by 3 and 4.");
		}
		else if ((userNumber % 3 == 0) || (userNumber % 4 == 0)) {
			//If the number is divisible by 3 or 4, it will print this statement
			System.out.println("The number is divisible by 3 or 4.");
			
			//If the number is divisible by 3 or 4 but not both, it will also print statement below
			//Uses "exclusive or" operator -> ^
			if ((userNumber % 3 == 0) ^ (userNumber % 4 == 0)){
				System.out.println("The number is divisble by 3 or 4, but not both.");
			}
		}
		else { 
			//Prints this statement if all conditions are false
			System.out.print(userNumber + " is not divisble by 3 or 4.");
		}
		
		//Closes input Scanner method
		input.close();	
	}
}





