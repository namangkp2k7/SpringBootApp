package com.dp.facade;

public class BankAccountFacade {

	private int accountNumber;

	private int securityCode;

	AccountNumberCheck acctChecker;

	SecurityCodeCheck codeChecker;

	FundCheck fundChecker;

	WelcomeToBank bankWelcome;

	public BankAccountFacade(int newAccNum, int newSecCode) {
		accountNumber = newAccNum;

		securityCode = newSecCode;

		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundCheck();

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())
				&& fundChecker.haveEnoughMoney(cashToGet)) {

			System.out.println("Transaction Complete \n");

		} else {
			System.out.println("Transaction failed");
		}
	}

	public void depositCash(double cashToDeposit) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
			fundChecker.makeDeposite(cashToDeposit);
			System.out.println("Trasaction completed \n");
		} else {
			System.out.println("Transaction failed \n ");
		}
	}

}
