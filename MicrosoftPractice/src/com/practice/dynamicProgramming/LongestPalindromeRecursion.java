package com.practice.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeRecursion {

	public String longestPalindrome(String s) {
		
		List<String> listOfPalindrome = new ArrayList<String>();
		longestPalindromeHelper(s,0,listOfPalindrome);
		
		int max = 0;
		String maxPalin = new String();

		for (int i = 0; i < listOfPalindrome.size(); i++) {
			
			if(listOfPalindrome.get(i).length() > max) {
				max = listOfPalindrome.get(i).length() ;
				maxPalin = listOfPalindrome.get(i);
			}
			

		}
		
		return maxPalin;

		
	}

private void longestPalindromeHelper(String s, int pos, List<String> listOfPalindrome) {
	
	if(pos == s.length())
		
	{
		return;
	}
	
		for(int i=pos;i<s.length();i++)
		{
			if(isPalindrome(pos,i,s)){
				
				String palindromicSnippet = s.substring(pos, i + 1);
				listOfPalindrome.add(palindromicSnippet);
				longestPalindromeHelper(s,pos+1,listOfPalindrome);
				//listOfPalindrome.remove(listOfPalindrome.size() - 1);
			}
		}
		
	}

private boolean isPalindrome(int pos, int i, String s) {
	
	while(pos<i)
	{
		if(s.charAt(pos) != s.charAt(i))
		{
			return false;
		}
		pos++;
		i--;
	}
	
	return true;
}



	public static void main(String[] args) {
		LongestPalindromeRecursion l = new LongestPalindromeRecursion();
		String str = l.longestPalindrome("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		System.out.println(str);

	}

}
