
public class Square_Constructor {
	//Instance variable
	double side;
	
	//Static variable
	static int NumberSquares;
	
	//Constructors 
	public Square_Constructor() {
		NumberSquares++;
		//this.side = 1;
	}
	
	public Square_Constructor(double s) {
		NumberSquares++;
		this.side = s;
	}
}
