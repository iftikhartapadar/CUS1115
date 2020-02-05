
public class TestSquare {

	public static void main(String[] args) {
		
		//create two squares
		Square_Constructor s1 = new Square_Constructor();
		Square_Constructor s2 = new Square_Constructor(5);
		
		System.out.println(s1.side);
		System.out.println(s2.side);
		System.out.println("Number of objects " + Square_Constructor.NumberSquares);
	}

}
