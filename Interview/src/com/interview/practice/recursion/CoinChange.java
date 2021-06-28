package com.interview.practice.recursion;

public class CoinChange {
	
	 private 	Integer[][] t;
	   public int change(int amount, int[] coins) {
	        
		 	 t = new Integer[coins.length + 1][amount + 1];
			   
		        return changeHelper1(amount,coins,coins.length);
	       // return changeHelper(amount,coins,coins.length);
	        
	    }
	    
	int changeHelper1(int amount, int[] coins, int n) {
		
		System.out.println("amount " + amount + "n " + n + "coins size" + coins.length);
		if (amount == 0) {
			return 1;
		}

		if (amount < 0 || n == 0) {
			return 0;
		}

		if (t[n][amount] != null) {
			return t[n][amount];
		}

		t[n][amount] = changeHelper1(amount - coins[n - 1], coins,  n) + changeHelper1(amount, coins,  n - 1);

		return t[n][amount];

	}
	    
	    int changeHelper(int amount, int[] coins,int n) {
	        System.out.println("n "+n+" coins size"+coins.length);
	        if(amount == 0){
	            return 1;
	        }
	     
	        if(amount < 0 || n == 0) {
	        	return 0;
	        }
	     
	       
	        
//	        if(coins[n-1]<amount){
	            
	        	return changeHelper(amount-coins[n-1],coins,n)
	                            + changeHelper(amount,coins,n-1);
	            
//	        }else{
//	            
//	        	return  changeHelper(amount,coins,n-1);
//	        }
	        
	       
	        
	    }
	    
	    public static void main(String[] args) {
			
	    	CoinChange c = new CoinChange();
	    	int[] coins = {10};
	    	System.out.println(c.change(10, coins));
		}

}
