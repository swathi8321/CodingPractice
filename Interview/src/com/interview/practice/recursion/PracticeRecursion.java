package com.interview.practice.recursion;

public class PracticeRecursion {

	public  void print(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		print(n-1);
		System.out.println(n);
	}
	public  void backwardPrint(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		backwardPrint(n-1);
		
	}

	public int fact(int n) {
		
		if (n == 1) {
			return n;
		}

		return n * fact(n - 1);
	}

	public boolean detectCapitalUse(String word) {
	        
	        
	        int[] flagCapSmall = new int[2];
	        
	        for(int i=0;i<word.length();i++){
	            if(Character.isUpperCase(word.charAt(i))){
	                flagCapSmall[0]++;
	            }
	            if(Character.isLowerCase(word.charAt(i))){
	                flagCapSmall[1]++;
	            }
	        }
	        
	        if(flagCapSmall[0] == word.length()){
	            return true;
	        }else if(flagCapSmall[1] == word.length()){
	            return true;
	        }else if(flagCapSmall[0] == 1){
	            if(Character.isUpperCase(word.charAt(0))){
	                return true;
	            }    
	        }else{
	            return false;
	        }
			return false;
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeRecursion pr = new PracticeRecursion();
		pr.print(7);
		System.out.println("************");
		pr.backwardPrint(8);
		System.out.println("************");
		System.out.println(pr.fact(5));
	}

}
