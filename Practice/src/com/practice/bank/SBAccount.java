package com.practice.bank;

public class SBAccount extends Account {
	
	public boolean withdraw(double withdraw) {
		
		if(accountBal - withdraw >=0) {
			accountBal -= withdraw;
			return true;
		}
		
		return false;
	}
	
	public void deposit(double depositAmt) {
		accountBal+=depositAmt;
	}

}
