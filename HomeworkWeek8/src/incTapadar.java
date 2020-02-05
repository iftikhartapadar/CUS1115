/* Author: Iftikhar Tapadar
   Date: 11/08/2019
   Section: 1115
   Homework Week 8
   increase_Tapadar
*/
class incTapadar {
	
  public static void main(String[] args) {
	 //Print System that uses 3 double numbers to tests method
	  //Calls method
	 System.out.println(increase_Tapadar(1.0, 4.0, 5.0));
  }
  
  //Method to see if the numbers are in increasing order
  public static boolean increase_Tapadar(double x, double y, double z) {
	  //Takes numbers from print statement and stores it into the arguments of x, y, z
	 //If they are in increasing order
	  if(x < y && y < z){
		  //Will give true if increasing
		  return true;
	  }
	  else {
		  //Will give false if the if statement is false
		  return false;
  }
  
  }
}