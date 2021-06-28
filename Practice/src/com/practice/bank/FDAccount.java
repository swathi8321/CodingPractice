package com.practice.bank;

public class FDAccount extends Account {
	
public double calculateRateInterest(double amount) {
		
		return amount * intRate/100;
		//calculate compound interest
	}

}
