package financeProject;

public class financemain {

	public static void main(String[] args) {

		bankaccount jim = new bankaccount("01-1234-1234567-00", 0.00);
		
		//double amount;
		
		System.out.println(jim.getAccountNumber());
		System.out.println(jim.getbalance());
		
		jim.depositMoney(120.03);
		
		jim.withdrawMoney(50.36);
		

	}

}
