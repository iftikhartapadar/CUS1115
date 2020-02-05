/* Author: Iftikhar Tapadar
   Date: 09/18/2019
   Section: 1115
   Homework Week 2
   TapadarProblem2c
*/
import java.util.Scanner;

public class TapadarProblem2c {

	public static void main (String[] args) {
		
		final double TIP = .17; //Declared TIP as constant and stores the tip percentage -> 17%
		double tipValue; //Variable to store amount of tip
		double totalValue; //Variable to store total bill amount
		
		//Created object called input that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Asks user for bill amount and assigns it to "userBill" variable
		System.out.println("What is your bill amount?");
		double userBill = input.nextDouble();
		
		//Computes the tip amount
		tipValue = userBill * TIP;
		
		//Computes the total amount user should pay
		totalValue = userBill + tipValue;
		
		//Displays amount of tip and the total amount user should pay
		//Concatenated to next line since the line was too long and hard to read
		System.out.println("The amount of your tip is $" + tipValue + 
				" and the total amount to pay is $" + totalValue + ".");
		
		//Closes Scanner method
		input.close();
	}
}
