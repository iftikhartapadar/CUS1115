/* Author: Iftikhar Tapadar
   Date: 11/20/2019
   Section: 1115
   Homework Week 11
   TestBankAccount_Tapadar
*/
public class TestBankAccount_Tapadar {

	public static void main(String[] args) {
		
		//Used account number parameter
		BankAccount_Tapadar bankAccount1 = new BankAccount_Tapadar(123);
		//Uses account number, interest rate, and balance as parameter
		BankAccount_Tapadar bankAccount2 = new BankAccount_Tapadar(321, 0.14, 200.0); 
		//Uses default constructor since nothing in parameter
		BankAccount_Tapadar bankAccount3 = new BankAccount_Tapadar(); 

		//Used bankAccount1 object and prints using the first constructor
		System.out.println("The balance in bank account 1 is " + bankAccount1.balance);
		System.out.println("The interest rate in bank account 1 is " + bankAccount1.interestRate);
		System.out.println("The account number in bank account 1 is " + bankAccount1.accountNumber);
		
		//Used bankAccount2 object and prints using the second constructor
		System.out.println("The balance in bank account 2 is " + bankAccount2.balance);
		System.out.println("The interest rate in bank account 2 is " + bankAccount2.interestRate);
		System.out.println("The account number in bank account 2 is " + bankAccount2.accountNumber);
		
		//Used bankAccount3 object and prints using default constructor
		System.out.println("The balance in bank account 3 is " + bankAccount3.balance);
		System.out.println("The interest rate in bank account 3 is " + bankAccount3.interestRate);
		System.out.println("The account number in bank account 3 is " + bankAccount3.accountNumber);
		
		//Called the statement instance method for account1
		bankAccount1.statement();
		//Called the statement instance method for account2
		bankAccount2.statement();
		//Called the statement instance method for account3
		bankAccount3.statement();
		
		/*Prints the number of accounts created by detecting the static variable numberAccounts...
		 * ...and how many times the constructors are used.
		 *I accessed the variable in a static way by calling it by the instance class name first 
		 */
		System.out.println("The number of accounts created are " + BankAccount_Tapadar.numberAccounts);
		
	}

}
