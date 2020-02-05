import java.util.Scanner;
public class Tapadar_7c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How large a triangle do you want?");
		int userSize = input.nextInt();
		
		//For loop to increase the amount of rows made in triangle
		for (int row = 1; row <= userSize; row++){
			//Nested for loop to decrease amount of stars made in each row of the triangle by 1
            for (int column = userSize; column >= row; column--){    
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		input.close();
	}

}


