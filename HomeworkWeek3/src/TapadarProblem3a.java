/* Author: Iftikhar Tapadar
   Date: 09/25/2019
   Section: 1115
   Homework Week 3
   TapadarProblem3a
*/
import java.util.Scanner;
public class TapadarProblem3a {

	public static void main (String[] args) {
		
		//Creates input object that uses Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter coordinates for point 1
		System.out.println("Enter the cordinates for point 1");
		System.out.print("Enter x1: ");
		double x1 = input.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = input.nextDouble();
		
		//Prompts user to enter coordinates for point 2
		System.out.println("Enter the cordinates for point 2");
		System.out.print("Enter x2: ");
		double x2 = input.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = input.nextDouble();
		
		//Computes distance formula
		double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
		
		//Displays result 
		System.out.print("The distance between point 1 and point 2 is: ");
		System.out.printf("%.3f", distance); //Formats result by adding 3 decimal places - covered in lecture notes
		
		input.close();
		
	}	
}
