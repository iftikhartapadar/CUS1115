
public class Tapadar_7b {

	public static void main(String[] args) {
		
		int startingYear = 2000;
		int endingYear = 2250;
		
		
		while(startingYear <= endingYear) {
			if((startingYear % 4 == 0) && (startingYear % 100 != 0) || (startingYear % 400 == 0)) {
				System.out.println(startingYear + " is a leap year");
			}
			startingYear++;
		}
		
	}

}
