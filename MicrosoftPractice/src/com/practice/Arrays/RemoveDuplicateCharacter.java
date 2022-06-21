package com.practice.Arrays;

import java.util.*;

public class RemoveDuplicateCharacter {
	
	public static String removeDuplicateLetters(String s) {
		char[] chrArray = s.toCharArray();
		Map<Character, String> mp = new HashMap<>();
		String nonDuplicateStr = new String();
		for (char c : chrArray) {

			if (!mp.containsKey(c)) {
				mp.put(c, nonDuplicateStr + c);
				//System.out.print("c" +"**");
				nonDuplicateStr=nonDuplicateStr+c;
				//System.out.print(" "+nonDuplicateStr);
			}

			
		}
		char[] chrArray1 = nonDuplicateStr.toCharArray();
		Arrays.sort(chrArray1);

		return new String(chrArray1);

	}
	
	public static void main(String args[] ){
		
		String input="babacd";
		System.out.print(removeDuplicateLetters(input));
		
	}
	 


}
	
	
			
	 
