package com.dp.facade;

public class AccountNumberCheck {

	private int accountNumber = 12345678;

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean accountActive(int accoNumToCheck) {
		if (accountNumber == getAccountNumber()) {
			return true;
		} else {
			return false;
		}
	}
}
