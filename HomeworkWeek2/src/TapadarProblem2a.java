/* Author: Iftikhar Tapadar
   Date: 09/18/2019
   Section: 1115
   Homework Week 2
   TapadarProblem2a
*/
import java.util.Scanner;

public class TapadarProblem2a {
	
	public static void main (String[] args) {
		
		double area; //Variable to store area
		double perimeter; //Variable to store perimeter
		
		//Created object called input that uses Scanner type
		Scanner input = new Scanner(System.in);
		
		//Asks user for for width of rectangle and assigned it to "width" variable
		System.out.println("Enter the width of the rectanagle.");
		double width = input.nextDouble();
		
		//Asks user for height of rectangle and assigns it to "height" variable
		System.out.println("Enter the height of the rectangle.");
		double height = input.nextDouble();
		
		//Computes area
		area = width * height;
		//Computes perimeter
		perimeter = ((2 * width)+(2 * height));
		
		//Displays area result
		System.out.println("The area of the recatnagle is " + area);
		//Displays perimeter result
		System.out.println("The perimeter of the recatnagle is " + perimeter);
		
		//Closes Scanner method
		input.close();
	}
}
