/* Author: Iftikhar Tapadar
   Date: 12/02/2019
   Section: 1115
   Homework Week 12
   TestBankAccount_Tapadar
*/
public class TestBankAccount_Tapadar {

	public static void main(String[] args) {
		
		//Used account number parameter
		BankAccount_Tapadar bankAccount1 = new BankAccount_Tapadar(123);
		//Uses account number, interest rate, and balance as parameter
		BankAccount_Tapadar bankAccount2 = new BankAccount_Tapadar(321, 0.14, 200.0); 
		//Uses default constructor since nothing in parameter
		//BankAccount_Tapadar bankAccount3 = new BankAccount_Tapadar(); 

		//Used bankAccount1 object and prints using the first constructor
		System.out.println("The balance in bank account 1 is " + bankAccount1.getBalance());
		System.out.println("The interest rate in bank account 1 is " + bankAccount1.interestRate);
		System.out.println("The account number in bank account 1 is " + bankAccount1.getaccountNumber());
		
		//Using setters to set new value
		bankAccount1.setBalance(-300);
		//Using getter to print new value
		System.out.println(bankAccount1.getBalance());
		
		
		
		//Adds space
		System.out.println();
		
		//Used bankAccount2 object and prints using the second constructor
		System.out.println("The balance in bank account 2 is " + bankAccount2.getBalance());
		System.out.println("The interest rate in bank account 2 is " + bankAccount2.interestRate);
		System.out.println("The account number in bank account 2 is " + bankAccount2.getaccountNumber());
		
		//Using setters to set balance of bank account 2 to 300
		bankAccount2.setBalance(100);
		
		//Using getter to print new value
		System.out.println(bankAccount2.getBalance());
		
		//Adds space
		System.out.println();
		
		//Calling statement method for bank account 2
		bankAccount2.statement();
		
		//Adds space
		System.out.println();

		//Calling withdraw method for bank account 2
		bankAccount2.withdraw(400);
		
		//Adds space
		System.out.println();
		
		//Displays overdraft result
		System.out.println("The overdraft is " + bankAccount2.overdraft);

		//Adds space
		System.out.println();
		
		//Withdraw $200 using withdraw method for bank account 2
		bankAccount2.withdraw(200);
		
		//Adds space
		System.out.println();

		//Checks statement and see results
		bankAccount2.statement();
		
		//Adds space
		System.out.println();
		
		//I deposited $2000 into the account
		bankAccount2.deposit(2000);
		//Displays overdraft result
		System.out.println("The overdraft is " + bankAccount2.overdraft);
		
		//Adds space
		System.out.println();
		
		//Checks statement and see results
		bankAccount2.statement();
		
		
	}

}
