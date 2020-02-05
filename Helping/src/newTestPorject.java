import java.util.Scanner;

public class newTestPorject {

	public static void main(String[] args) {
		
//Input + Variables
			Scanner input = new Scanner(System.in);
			//Empty string that stores name of course
			String courseName = "";
			//Variable that will store the calculated average
			double avg = 0;
			//Empty string that will store the letter grade of the course
			String lettergrade = "";
			//Empty string that stores the grade of course
			String gradePoint = ""; 
		
			
			for (int course = 1; course <= 4;course++)
			{
				{
					System.out.println("Enter the name of course " + course);
					courseName = input.next();
					System.out.println("Enter three test grades: ");
					double grade1 = input.nextDouble();
					double grade2 = input.nextDouble();
					double grade3 = input.nextDouble();
					avg = (grade1 + grade2 + grade3)/3.0;
				}
				}	
			
			
// Lettergrade If statement				
				if (avg >= 90)
			      {
					lettergrade = "A";
			      }
			      else if (avg >= 80)
			      {
			    	  lettergrade = "B";
			      }
			      else if (avg >= 70)
			      {
			    	  lettergrade = "C";
			      }
			      else if (avg >= 60)
			      {
			    	  lettergrade = "D";
			      }
			      else if (avg < 60)
			      {
			    	  lettergrade = "F";
			      }
// gradePoint If Statement
				if (avg >= 90)
			      {
					gradePoint = "4.0";
			      }
			      else if (avg >= 80)
			      {
			    	  gradePoint = "3.0";
			      }
			      else if (avg >= 70)
			      {
			    	  gradePoint = "2.0";
			      }
			      else if (avg >= 60)
			      {
			    	  gradePoint = "1.0";
			      }
			      else if (avg < 60)
			      {
			    	  gradePoint = "0.0";
			      }
			
			
			
// Output		
			
				String format = "%s%18.1f%15s%21s%n";
				System.out.printf("%s%20s%20s%20s%n", "Course", "Average", "Letter Grade", "Grade Point");
				System.out.printf(format, courseName, avg, lettergrade, gradePoint);
				System.out.println();
				
				input.close();
			}		
				
			
	
			}

