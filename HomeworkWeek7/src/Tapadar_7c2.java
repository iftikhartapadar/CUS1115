import java.util.Scanner;
public class Tapadar_7c2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How large a triangle do you want?");
		int userSize = input.nextInt();
		
		for(int row = userSize; row >= 1; row--) {
			for(int column = row; column >= 1; column--) {
				System.out.print(column);
			}
			//number--;
			System.out.println();
		}
		
		input.close();
	}
}
