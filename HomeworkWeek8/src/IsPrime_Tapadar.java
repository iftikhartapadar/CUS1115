/* Author: Iftikhar Tapadar
   Date: 11/08/2019
   Section: 1115
   Homework Week 8
   IsPrime_Tapadar
*/
import java.util.Scanner;
public class IsPrime_Tapadar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100. True means that it is a prime number. False means that is it not.");
		int userNumber;
		
		//I used the hasnext method we learned and used in homework 7.
		//Checks to see if number is an integer
		while(input.hasNext()) {
			//If number is integer it will be assigned
			userNumber = input.nextInt();
			//Breaks if it is 0
			if(userNumber == 0 )
                break;
			//Runs if it is in correct range
			if(userNumber >= 1 && userNumber <= 100){
				//Calls method
                System.out.println(userNumber+ " is " + prime_Tapadar(userNumber));

            }
			//Prompts user to enter another number or exit using 0
			 System.out.println("Enter another number from 1 to 100, or enter 0 to exit");
             
		}
		input.close();
	}
	public static boolean prime_Tapadar(int userNumber) {
		
		//The number can not be 1
		if (userNumber <= 1) {
            return false; 
		}
        //Start from 2 and goes all the way before the user number 
        for (int i = 2; i < userNumber; i++) 
        	//If any number is evenly divisible besides the number itself, it is not prime
            if (userNumber % i == 0) {
                return false; 
            }
        //Returns if it is prime
        return true; 
	}

}
