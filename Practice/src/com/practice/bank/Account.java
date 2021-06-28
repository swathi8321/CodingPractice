package com.practice.bank;

public class Account {

	protected  int accountNo;
	protected double accountBal;
	protected double intRate;
	
	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	
	public String getAccountDetails() {
		
		String str = "Account No. " + accountNo
				+ " \n Balance "+accountBal
				+"\n Interest Rate "+intRate;
		return str;
		
	}
	
	public double calculateRateInterest(double amount) {
		
		return amount * intRate/100;
		
	}
	
	public void setAccountNo(int accountno) {
	//	this.accountNo = accountno;
		this.accountNo++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBAccount s = new SBAccount();
		
		s.deposit(1900);
		s.deposit(8900);
		s.calculateRateInterest(4000);
		s.withdraw(100);
		
		;
		
		System.out.println(s.getAccountDetails());


	}

}
