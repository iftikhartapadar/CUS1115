/* Author: Iftikhar Tapadar
   Date: 11/13/2019
   Section: 1115
   Homework Week 9
   TestCircle_Tapadar
*/
public class TestCircle_Tapdar {
	public static void main(String[] args) {
		
		//Instantiating MyCircle_Tapadar
		MyCircle_Tapadar circle = new MyCircle_Tapadar();
		
		//A loop that will repeat 3 times
		for(int i=1; i<=3; i++) {
			//I used Math.random() method to produce a random number
			//Made it from the range of 1.0 to 10.0
			//The value will be stored in the double variable num
			double num = 1.0 + (Math.random() * (10.0 - 1.0 + 1));
			//I used this print statement as a way to check the radius value
			System.out.println("The radius is " + num);
			//I assigned the instance varible the "num" value
			circle.radius = num;
			//I called the getArea and getPerimeter instance methods
			System.out.println("The area is " + circle.getArea(circle.radius) + 
					". The perimeter is " + circle.getPerimeter(circle.radius) + ".");
		}
	}
}
