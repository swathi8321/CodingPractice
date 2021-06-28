package com.interview.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PhoneDirectory {
	
	Map<Integer,String> mp = new HashMap<Integer,String>();
	public void buildMap() {
		
		mp.put(2,"abc");
		mp.put(3,"def");
		mp.put(4,"ghi");
		mp.put(5,"jkl");
		mp.put(6,"mno");
		mp.put(7,"pqrs");
		mp.put(8,"tuv");
		mp.put(9,"wxyz");
		
		
	}
	
	private char getCharKey(int telephoneKey,int place) {
		
		return(mp.get(telephoneKey).charAt(place));
	}
	
	public void findPhoneNumber(int[] number) {
		
		char[] result = new char[number.length];
		buildMap();
		
		findPhoneNumberHelper(number,result,0);
		
	}

	private void findPhoneNumberHelper(int[] number, char[] result, int level) {
		
		if(level == number.length ) {
			System.out.println(result);
			return;
		}
		
		
		for(int i=0;i<3;i++) {
			
			result[level] = getCharKey(number[level],i);
			
			findPhoneNumberHelper(number,result,level+1);
			
			if(number[level] == 0 || number[level] ==1) {
				return;
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneDirectory pd = new PhoneDirectory();
		int[] number= {2,3,4};
		 pd.findPhoneNumber(number);
		
		
	}

}
