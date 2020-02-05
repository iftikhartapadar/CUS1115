/* Author: Iftikhar Tapadar
   Date: 11/08/2019
   Section: 1115
   Homework Week 8
   TheMin_Tapadar
*/
import java.util.Scanner;
public class TheMin_Tapadar {

	public static void main(String[] args) {
		
		//Scanner object called input
		Scanner input = new Scanner(System.in);
		//Prompts user
		System.out.println("Enter 10 numbers in the range of 1 to 1000");
		//Stores the user number in variable "userNumber
		int userNumber = input.nextInt();
		/*Variable that assigns userNumber to the min...
		*...variable as a way to compare two numbers when method is called
		*/
		int min = userNumber;
		
		//Checks to see if number is in appropriate range
		if(userNumber >= 1 && userNumber <= 1000) {
		//I made the loop repeat 9 times here since I made user enter a number beforehand equaling it to 10 numbers total
		for(int i = 1; i <= 9; i++) {
			userNumber = input.nextInt();
			//Calls method
			//Updates after each entry
			System.out.println(minNumber(userNumber, min));
			}
		}
		//Shows minimum after all 10 numbers are displayed
		System.out.println("The minimum number out of all 10 intgers is " + minNumber(userNumber, min));
		
		input.close();
	}
	
	//Method to find minimum number
	public static int minNumber(int x, int y) {
		//if x(userNumber) is less than y(minimum number)
		if(x < y){
			//The userNumber will be assigned to the min number
			y = x;
			}
		//Returns the min number
		return y;
	}
	
}
