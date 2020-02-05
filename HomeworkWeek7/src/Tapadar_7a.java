import java.util.Scanner;
public class Tapadar_7a {

	public static void main(String[] args) {
		
		//Created input object that uses Scanner
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		//Prompt the user to enter a number
		System.out.println("Enter a positive integer.");
		int userNumber = input.nextInt();
		
		//If the user number is positive it will run this if statement 
		if(userNumber >= 0) {
			for(count = 0; count < userNumber; count++) {
				sum = count + sum;
			}
		}
		//If the user number is negative, it will run this else if statement
		else if(userNumber < 0) {
			System.out.println("Please enter a positive integer again.");
			while(userNumber < 0) {
				userNumber = input.nextInt();
			for(count = 0; count < userNumber; count++) {
				sum = count + sum;
				}
			}
		}

		//Prints result
		System.out.println("The sum of the first " + userNumber + 
				" positive natural numbers is " + sum);
		
		input.close();
	}

}
