package financeProject;

public class bankaccount {
	
	private String accountNumber;
	private double balance;
	
	public bankaccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	//Getter for Account Number
	
	public String getAccountNumber() {
		
		return accountNumber;
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
				+ "New balance: $" +balance);
		}
		else {
			System.out.println("\nInvalid withdrawal amount due to sufficient funds");
		}
	}
	
	
}
