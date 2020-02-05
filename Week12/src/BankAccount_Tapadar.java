/* Author: Iftikhar Tapadar
   Date: 11/20/2019
   Section: 1115
   Homework Week 11
   BankAccount_Tapadar
*/
public class BankAccount_Tapadar {

	//Instance methods
	private double balance;
	double interestRate;
	private int accountNumber;
	//Static variable that keeps track of number of accounts created
	//Used this in all the constructors I made
	static int numberAccounts;
	
	//Constructor that takes specified account number
	public BankAccount_Tapadar(int accountNumber) {
		//Sets the balance and interest rate
		this.balance = 100;
		this.interestRate = 0.13;
		this.accountNumber = accountNumber;
		//Static variable keeping track of bank account created
		numberAccounts++;
	}
	
	//Constructor that takes specified account number, interest rate, and balance
	public BankAccount_Tapadar(int accountNumber, double interestRate, double balance) {
		//Sets the account number, interest rate, and balance to what was entered within parameter of object
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.balance = balance;
		//Static variable keeping track of bank account created
		numberAccounts++;
	}
	
	//Default Constructor
	public BankAccount_Tapadar() {
		//Static variable keeping track of bank account created
		numberAccounts++;
	}
	
	
	//getters
	//Gets access to balance 
	public double getBalance() {
		return this.balance;
	}
	//Gets access to account number
	public int getaccountNumber() {
		return this.accountNumber;
	}
	
	//Setters
	//Setter that takes parameter and sets it to private instance variable
	public void setBalance(double b) {
		if(b > 0)
			this.balance += b ;
		else
			System.out.println("Invalid amount");
	}
	//Setter that takes parameter and sets it to private instance variable
	public void setaccountNumber(int a) {
		if(a>10)
			this.accountNumber = a;
		else
			System.out.println("Invalid Account");
	}
	
	//Method to print all instance variables
	//I made it void type since there is no return or parameter
	public void statement() {
		System.out.println("The balance is " + this.balance);
		System.out.println("The interest rate is " + this.interestRate);
		System.out.println("The account number is " + this.accountNumber);
	}
	
	//Method that takes a deposit parameter and adds it to the balance
	public double deposit(double depositAmount) {
		/*
		 * I took the depositAmount and added it with balance...
		 * ...where it would equal and reassign to the new balance 
		 */
		this.balance += depositAmount;
		//Returns the new balance amount which is a double value
		return this.balance;
	}
	
}
