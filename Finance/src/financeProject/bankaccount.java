package financeProject;

import java.util.Scanner;

public class bankaccount {
	
	public String name;
	private String accountNumber;
	private double balance;
	
	public bankaccount(String name) {
		this.name = name;
		this.accountNumber = getAccountNumber();
		this.balance = getbalance();
	}
	
	//Getter for Account Number
	
	public String getAccountNumber() {
		
		return name+" "+accountNumber;
	}
	
	//Getter for Balance
	
	public double getbalance() {
		
		return balance;
	}
	
	//method to deposit money
	
	public void depositMoney(double amount) {
		
		if(amount > 0) {
			balance += amount;
			System.out.println("\nDeposit of $" +amount+ " has been made.\n"
					+ "New balance: $" +balance);
			
		}
		else {
			System.out.println("\nInvalid Transaction. Try Again");
		}
	}
	
	//method to withdraw money
	
	public void withdrawMoney(double amount) {
		
		if (amount > 0 && amount < balance){
			
			balance -= amount;		
			System.out.println("\nWithdrawal of $" +amount+ " has been made.\n"
				+ "\nNew balance: $" +balance);
		}
		else {
			System.out.println("\nYou don't have enough money I'm afraid.\nMaybe you should do more chores");
		}
	}
	
	
}
