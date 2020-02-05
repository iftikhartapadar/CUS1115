/* Author: Iftikhar Tapadar
   Date: 12/02/2019
   Section: 1115
   Homework Week 12
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
	//Stores original interest rate 
	double originalRate = interestRate;
	
	//Keeps track of overdraft result
	boolean overdraft = false;
	
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
		//Stores original interest rate
		this.interestRate = interestRate;
		this.originalRate = this.interestRate;
		this.balance = balance;
		//Static variable keeping track of bank account created
		numberAccounts++;
	}
	
	//Default Constructor
	public BankAccount_Tapadar() {
		//Static variable keeping track of bank account created
		numberAccounts++;
	}
	
	
	//GETTERS
	//Gets access to balance 
	public double getBalance() {
		return this.balance;
	}
	//Gets access to account number
	public int getaccountNumber() {
		return this.accountNumber;
	}
	
	//SETTERS
	//Setter that takes parameter and sets it to private instance variable
	public void setBalance(double b) {
			this.balance += b ;
	}
	
	//Setter that takes parameter and sets it to private instance variable
	public void setaccountNumber(int a) {
		if(a <= 0)
			System.out.println("Invalid Account Number");
		else
			this.accountNumber = a;
	}
	
	//Method to print all instance variables
	//I made it void type since there is no return or parameter
	public void statement() {
		System.out.println("The balance is " + this.balance);
		System.out.println("The interest rate is " + this.interestRate);
		System.out.println("The account number is " + this.accountNumber);
	}
	
	//Method that takes a deposit parameter and adds it to the balance
	public void deposit(double depositAmount) {
		/*
		 * I took the depositAmount and added it with balance...
		 * ...where it would equal and reassign to the new balance 
		 */
		//if(this.balance > 0) {
		//	this.interestRate = this.originalRate;
		//}
		//When the deposit is made, the interest rate will go back to original
		
		System.out.println(this.balance += depositAmount);
		//If balance is positive original rate will be restored
		if(this.balance > 0)
			this.interestRate = this.originalRate;
	}
	
	//Withdraw function 
	public void withdraw(double amount) {
		//This is to find the account balance after the amount is withdrawn
		double remainingAmount = this.balance - amount;
	
		//If the amount the person wants to withdraw does not exceed $-500 and is less than 0 - overdraft mode will be on
		if((this.balance > 0) && (this.balance - amount >= -500) && (this.balance- amount <= 0)) {
			this.overdraft = true;
			//Creates new account balance
			this.balance = remainingAmount;
			//In overdraft mode, the interest rate will be 0.0%
			this.interestRate = 0;
			//Print statement that user will see
			System.out.println("Your account is in overdraft mode. The remaining balance is " + 
			this.balance + " The interest rate is now " + this.interestRate + ".");
		}
		
		//If the amount the person want to withdraw is lower and exceeds -500, the person can not withdraw and be invalid
		//Or if the balance is less than 0
		else if((this.balance - amount < -500) || (this.balance < 0)) {
			this.overdraft = false;
			System.out.println("Invalid withdraw");
		}
		
		//If the persons balance is greater than 0, the account be normal and overdraft mode will be turned off
		else {
			this.overdraft = false;
			//Makes interest rate equal the original rate
			this.interestRate = this.originalRate;
			System.out.println("Your account is out of overdraft mode.");
		}
		
	}
	
}
