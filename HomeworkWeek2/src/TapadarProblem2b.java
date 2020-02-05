/* Author: Iftikhar Tapadar
   Date: 09/18/2019
   Section: 1115
   Homework Week 2
   TapadarProblem2b
*/
import java.util.Scanner;

public class TapadarProblem2b {
	
	public static void main (String[] args) {
		
		double conversion; //Variable that will store the value of feet to meters
		
		//Object called input is created that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Asks user to enter amount of feet and assigns it to "userFeet" variable
		System.out.println("Enter the amount Feet you want to convert into Meters.");
		double userFeet = input.nextDouble();
		
		//Computes feet into meters
		conversion = userFeet * 0.3048;
		
		//Displays result
		System.out.println(userFeet +" feet is equal to " + conversion + " meters.");
		
		//Closes Scanner method
		input.close();
	}
}
