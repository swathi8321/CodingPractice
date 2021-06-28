package com.interview.practice.sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
	  public int findDuplicate(int[] nums) {
	        
	        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	        int count = 0;
	        for(int i=0;i<nums.length;i++){
	            
	            
	            if(mp.containsKey(nums[i])){
	                return nums[i];
	            }
	            
	            mp.put(nums[i],count++);
	            
	            
	        }
	        return -1;
	        
	    }
	  
	  public int findDuplicate(List<Integer> lists) {
	        
	        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	        int count = 0;
	        for(int item:lists){
	            
	            
	            if(mp.containsKey(item)){
	                return item;
	            }
	            
	            mp.put(item,count++);
	            
	            
	        }
	        return -1;
	        
	    }
	  
	  public void test() {
		  
		  int s =1;
		  String t = String.valueOf(s);
		  int k = Integer.parseInt(t);
		  System.out.println(t+2);
		  System.out.println(k+2);
		  
	  }
	  
	  public boolean isPallindrom(String str) {
	        
			char[] arr = str.toCharArray();
			int length = arr.length - 1;
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] != (arr[length - i]))) {
					return false;
				}
			}

			return true;

		}
	  
	public boolean palindromePermutation(String str) {

		char[] ch = str.toCharArray();

		int[] flag = new int[128];
		int countOdd = 0;
		for (char c : ch) {

			if (isValid(c)) {
				c = Character.toLowerCase(c);
				flag[c]++;
				if (flag[c] % 2 == 1) {

					countOdd++;

				} else {
					countOdd--;
				}

			}
		}

		return countOdd <= 1;

	}
	private boolean isValid(char c) {
		 boolean x=Character.isAlphabetic(c)? true:false;
		 return x;
	}

	public boolean isUnique(String str){
			
			char[] ch = str.toCharArray();
			
			String[] flag = new String[3];
			
//			for(int x:flag) {
//				System.out.println(x);
//				
//			}
//			for(char c:ch){
//				flag[c]++;
//				if(flag[c]>1){
//					return false;
//				}
//			}
			
			return true;

		}
	  
	  
	  public boolean isPermuation(String s1,String s2){

			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			if(s1.length() != s2.length()){
				return false;
			}
			
			int[] flag = new int[128];
			
			for(char ch:ch1){
				flag[ch]++;

			}
			
			for(char ch:ch2){
				flag[ch]--;
				if(flag[ch]<0){
					return false;
				}

			}
			
			return true;
			

		}

	  
	  public static void main(String[] args) {
		FindDuplicates d = new FindDuplicates();
		d.test();
		System.out.println( d.palindromePermutation("Tact Coa"));
	}
}
