package com.dp.facade;

public class FundCheck {

	private double cashInAccount = 1000.00;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposite) {
		cashInAccount += cashDeposite;
	}
	
	public boolean haveEnoughMoney (double cashToWithdrawl){
		if(cashToWithdrawl > getCashInAccount()){
			System.out.println("Error : you don't have enough money");
			System.out.println("Current Balance : "+ getCashInAccount());
			return false;
		}
		else
		{
			decreaseCashInAccount(cashToWithdrawl);
			System.out.println("Withdrawl completed : Current Balance is :- " + getCashInAccount());
			return true;
		}
	}

	
	public void makeDeposite (double cashToDeposite){
		increaseCashInAccount(cashToDeposite);
		System.out.println("Deposite Complete current balance is + " + getCashInAccount() );
	}
}
