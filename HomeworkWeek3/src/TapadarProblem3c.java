/* Author: Iftikhar Tapadar
   Date: 09/25/2019
   Section: 1115
   Homework Week 3
   TapadarProblem3c
*/
import java.util.Scanner;
public class TapadarProblem3c {

	public static void main (String[] args) {
		
		//Created input object that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Asks user for 3 digit number
		System.out.println("Enter a three digit number.");
		int userNumber = input.nextInt();
		System.out.println("The number you entered is: " + userNumber);
		
		//Finds "Hundred" digit 
		int hundredDigit = userNumber / 100; 
		userNumber = userNumber % 100;
		
		//Finds "tens" digit
		int tensDigit = userNumber / 10;
		userNumber = userNumber % 10;
		
		//Finds "ones" digit
		int onesDigit = userNumber / 1;
		userNumber = userNumber % 1;
		
		//Computes sum of the three digits
		int digitSum = (hundredDigit + tensDigit + onesDigit); 
		
		//Computes product of three digits
		int digitProduct = (hundredDigit * tensDigit * onesDigit); 
		
		System.out.println("The sum of the three digits is: " + digitSum);
		System.out.println("The product of the three digits is: " + digitProduct);
		
		input.close();
		
	}
}
