package financeProject;

import java.util.Scanner;

public class financemain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Get user input for account information
		String name = enterAccountInfo(scanner);
		
		chores(scanner, name);
		
		// Create a new BankAccount instance with the provided name
		bankaccount userAccount = new bankaccount(name);
		}
	
			
	public static String enterAccountInfo(Scanner scanner) {
		
		double initialBalance = 0.00;
		System.out.println("Please enter your name: \n");
		String name = scanner.nextLine();
		
		System.out.println("\nPlease enter your secret password: \n");
		String accountNumber = scanner.nextLine();
		
		//System.out.println("\nPlease enter your bank balance: \n");
		//double balance = scanner.nextDouble();
		//scanner.nextLine();
		
		System.out.println("\nWelcome " +name+ 
				"\n\nYour account number is " +accountNumber+ 
				"\n\nYour Opening Balance is $" +initialBalance);
		
		return name;
	
	}
	
	
	public static void chores(Scanner scanner, String name) {
		
		System.out.println("\nWould you like to earn extra money by helping out around the house? \n"
				+ "Type Yes or No\n");
		String replyChores = scanner.nextLine();
		
		if (replyChores.equals("yes") || (replyChores.equals("y")) || (replyChores.equals("Y"))
				|| (replyChores.equals("Yes"))) {
			System.out.println("\nGreat! That will earn you extra money to deposit in your bank account");
			System.out.println("\n\nHow much money would you like to get paid for the job?\n");
			double amount = scanner.nextDouble();
			
		
			bankaccount userAccount = new bankaccount(name);
			userAccount.depositMoney(amount);
		
		}
	
	}
	
		
}
