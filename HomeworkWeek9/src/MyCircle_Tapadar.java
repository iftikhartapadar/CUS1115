/* Author: Iftikhar Tapadar
   Date: 11/13/2019
   Section: 1115
   Homework Week 9
   MyCircle_Tapadar
*/
public class MyCircle_Tapadar {
	
	//Instance variable for radius
	double radius;

	//Finds area
	public double getArea(double r) {
		this.radius = r;
		//Will store area value
		double area;
		//This is the formula for area
		area = 3.14 * (this.radius * this.radius);
		//Returns area
		return area;
	}
	
	public double getPerimeter(double r) {
		this.radius = r;
		//Stores perimeter value
		double perimeter;
		//Formula for area
		perimeter = 2 * 3.14 * this.radius;
		//Returns perimeter
		return perimeter;
	}
	
}
