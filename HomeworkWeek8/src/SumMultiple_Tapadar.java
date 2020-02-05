/* Author: Iftikhar Tapadar
   Date: 11/08/2019
   Section: 1115
   Homework Week 4
   SumMultiple_Tapadar
*/
public class SumMultiple_Tapadar {
	
	public static void main(String[] args) {
		
		//m = number of multiples
		//n = the number
		//Print system that calls system
		System.out.println(sumOfMultiples(3, 2));
		System.out.println(sumOfMultiples(5, 2));
		System.out.println(sumOfMultiples(6, 7));
		
	}
	
	public static int sumOfMultiples(int m, int n) {
		//Stores the sum of the multiples 
		int sum = 0;
		
		/*
		 * In the for loop I start with i = 0 to include 0 as a multiple
		 * I used n*m to create the range 
		 * i+=n increments and goes to the next number that is a multiple
		 */
		for(int i = 0; i < (n*m); i+=n) {
			//The sum will store "i" which should be the multiple and add it to the previous sum 
			sum = i + sum;
		}
		//Returns sum of multiples
		return sum;
	}
	
}
