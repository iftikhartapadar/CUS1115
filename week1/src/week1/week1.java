package week1;
import java.util.Scanner;
public class week1 {

	public static void main(String[] args) {
		
		/*double[] values = new double[5];
		double[] moreValues = {1,2, 3, 4};
		double[] numbers = new double[8];
		numbers[1] = 5;
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		System.out.println();
		
		
		int[] age = {2, 12, 1};
		System.out.println(age.length);
		
		System.out.println();
		
		int[]num = {1,1,2,3,5,8,13};
		
		for(int x : num) {
			System.out.println(x);
		}
		
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        
        int[] temperatures = new int[days];  // array to store days' temperatures
        int sum = 0;

        for (int i = 0; i < days; i++) {     // read/store each day's temperature
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = console.nextInt();
            sum += temperatures[i];
        }
        double average = (double) sum / days;

        int count = 0;                       // see if each day is above average
       /* for (int i = 0; i < days; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }*/
 
       /* for(int t : temperatures) {
        	if (t > average) 
                count++;
        }*
        */
        
 
        // report results
      //  System.out.printf("Average temp = %.1f\n", average);
        //System.out.println(count + " days above average");
		
		
        String[] yesNo = {" Yes", " No"};
        System.out.println("First" + yesNo[0] + " second" + yesNo[1]);
		
        String[] words = new String[10];
        
        double numbs[] = new double[20];
        
        int numbers[] = {1,3,5,7,9};
        //lab1q1
        //hw1q1
}
	
	//Methods
	
	public static double slope(int x1, int y1, int x2, int y2) {
		double dy = y2 - y1;
		double dx = x2 - x1;
		return dy / dx;
	}
	
	public static void message1() {
		System.out.println("This is message1.");
	}
	
	public static void message2() {
			System.out.println("This is message2.");
			message1();
			System.out.println("Done with message2.");
	}
	
		
	public static void printWarning() {
		System.out.println("This product causes cancer");
		System.out.println("in lab rats and humans.");
		}
	
}
