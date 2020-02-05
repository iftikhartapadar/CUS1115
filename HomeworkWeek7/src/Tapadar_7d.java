import java.util.Scanner;
public class Tapadar_7d{
	
   public static void main(String args[]){
	   
	   //Will store the number the user enters
       int userNumber;
       
       //Object called input that uses Scanner
       Scanner input = new Scanner(System.in);
       //Prompts user to enter number
       System.out.println("Please enter an integer between 100 and 999:");
       System.out.println("Enter 0 if you want to exit");
       
       //While loop that executes if number is an integer
       while(input.hasNext()){
           if(input.hasNextInt()){
        	   //If number is an integer it will be assigned to userNumber variable
               userNumber = input.nextInt();
               //If the integer equals 0, it will break out of loop
               if(userNumber == 0 )
                   break;
               //If it is in correct range, it will print reverse number
               //I created a method (learned from week 8) to help print the reverse number
               if(userNumber >= 100 && userNumber <= 999){
                   System.out.println("The reverse of n = " + userNumber + ", is " + reverse(userNumber));

               }else{
            	   //Lets user know its not in correct range or type
                   System.out.println("The integer is not in the correct range/type");
                  
               }
           }else{
        	   //Will execute and make user enter integer again if not in correct type range
               System.out.println("The integer is not in the correct range/type");
               input.nextInt();
           }
           System.out.println("Please enter an integer between 100 and 999:");
           System.out.println("Enter 0 if you want to exit");
       }
       //Close scanner
       input.close();
   }
   //Method to reverse the user number (Learned in week 8)
   public static int reverse(int userNumber){
	   int hundredDigit = (userNumber / 100) * 1;
	   userNumber = userNumber % 100;
	   
	   int tenDigit = (userNumber / 10) * 10;
	   userNumber = userNumber % 10;
	   
	   int oneDigit = (userNumber / 1) * 100;
	   userNumber = userNumber % 1;
	   
	   int newNumber = hundredDigit + tenDigit + oneDigit;
       /*int new_num = 0;
       int remainder;
       //Method will execute if the user number is not 0 only
       while(userNumber != 0){
           remainder = userNumber % 10;
           new_num = new_num * 10 + remainder;
           userNumber = userNumber / 10;
       }*/
       return newNumber;
   }
}

	


