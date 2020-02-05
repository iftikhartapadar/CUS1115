/* Author: Iftikhar Tapadar
   Date: 12/11/2019
   Section: 1115
   Project Fall 2019
   Orphan_Tapadar
*/
public class Orphan_Tapadar {

	private int id;
	private String name;
	//Either M or F		
	private char gender;
	private boolean isAdopted;
	int age;
	String race;
	//Keeps track of number of orphan objects
	//Updated in the constructor
	static int numOfOrphansObjects;
	//Represents current number of adopted orphans
	static int num_adopted;
	//Constant variable that represent capacity of orphanage
	static final int ORPHANAGE_CAPACITY = 8;
	
	//Constructors
	//Takes ID in argument
	public Orphan_Tapadar(int id) {
		//Initializes name and race
		this.name = "Doe";
		this.race = "Unknown";
		numOfOrphansObjects++;
	}
	
	//Constructors takes in parameters and initializes instance variables to those specific values
	public Orphan_Tapadar(int id, String name, int age,char gender, String race){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.race = race;
		numOfOrphansObjects++;
	}
	
	//Default constructor that takes no arguments
	//Initializes each instance variable 
	public Orphan_Tapadar() {
		this.id = 1111;
		this.name = "Jane";
		this.gender = 'F';
		this.isAdopted = false;
		this.age = 10;
		this.race = "Unknown";
		numOfOrphansObjects++;
	}
	
	//Getters 
	//Getter for id
	public int getId(){
		return this.id;
	}
	
	//Getter for getName
	public String getName() {
		return this.name;
	}
	
	//Getter for gender
	public char getGender() {
		return this.gender;
	}
	
	//Getter for isAdopted
	public boolean getIsAdopted() {
		return this.isAdopted;
	}
	
	//Setters
	//Setter for id -> has data integrity -> ensures it is a 4 digit number
	public void setId(int i) {
		//If the id is greater than or equal to 1000 and less than or equal to 9999 
		if(i >= 1000 && i <= 9999)
			this.id = i;
		else
			System.out.println("Invalid ID number");
	}
	
	//Setter for name
	public void setName(String n) {
		this.name = n;
	}
	
	//Setter for gender
	public void setGender(char g) {
		this.gender = g;
	}
	
	//Setter for isAdopted
	public void setIsAdopted(boolean a) {
		this.isAdopted = a;
	}
	
	
	//Methods
	//Displays orphan information using all instance variable
	public void orphanInfo() {
		System.out.println("The ID of the orphan is " + this.id + ".");
		System.out.println("The name of the orphan is " + this.name + ".");
		System.out.println("The gender of the orphan is " + this.gender + ".");
		System.out.println("The adoption status of the orphan is " + this.isAdopted + ".");
		System.out.println("The age of the orphan is " + this.age + ".");
		System.out.println("The race of the orphan is " + this.race + ".");
	}
	
	//Method that prints hello statement with orphan name and age
	public void introduceMyself() {
		System.out.println("Hello, my name is " + this.name + 
				". My age is " + this.age + ".");
	}
	
	//Instance variable to store wether medical record is true or false
	boolean medicalRecord;
	//Method that checks to see if orphan has medical record on file
	public boolean medicalRecord() {
		//Produces and stores number that with a range of 0 to 10
		double num = 0 + (Math.random() * ((10.0 - 0) + 1));
		if(num < 5) {
			//If the num is less than 5 -> medical record will be false(on file) and return
			this.medicalRecord = false;
			return this.medicalRecord;
		}
		else {
			//If num is greater than 5 -> medical record will be true(on file) and return
			this.medicalRecord = true;
			return this.medicalRecord;
		}
	}
	
	//Prepares each orphan for adoption
	public void readyAdoption() {
		//If medical record is true (or is on file) it will execute "if" statement
		if(this.medicalRecord = true) {
			//Will assign the orphan to an adopted status by stating true
			this.isAdopted = true;
			//As more orphans are adopted -> it will increment
			Orphan_Tapadar.num_adopted++;
			//Displays message
			System.out.println("Congratulations " +  this.name + " you will be adopted.");
		}
		else {
			//If medical record is false (not on file) this message will display
			System.out.println("Sorry " + this.name  +  " you need to have your medical record up to date first.");
		}
	}
	
	//Method that checks-out orphan
	public void checkOut() {
		//If they are ready to be adopted, this "if" statement will be executed
		if(this.isAdopted = true) {
			//When checked out, this would decrement the amount of orphans left
			numOfOrphansObjects--;
			//Displays this message when checked out
			System.out.println(this.name + " has checked out.");
		}
		else {
			//If not checked out, it will display this message
			System.out.println(this.name + " has not checked out.");
		}
	}
	
	//Static method that displays the orphanage capacity, number of adopted children, and number of orphans left in establishment
	public static void orphanageStatus() {
		System.out.println("The orphanage capacity is " + Orphan_Tapadar.ORPHANAGE_CAPACITY + ".");
		System.out.println("The number of orphans adopted is " + Orphan_Tapadar.num_adopted + ".");
		System.out.println("The current number of orphans in the establishment is " + 
		Orphan_Tapadar.numOfOrphansObjects + ".");
	}
		
}
