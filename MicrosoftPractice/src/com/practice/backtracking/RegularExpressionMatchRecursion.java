package com.practice.backtracking;

import java.util.List;
/*
 * There are two cases to consider:
First, the second character of p is *, now p string can match any number of character before *. if(isMatch(s, p.substring(2)) means we can match the remaining s string, otherwise, we check if the first character matches or not.
Second, if the second character is not *, we need match character one by one.
 */
public class RegularExpressionMatchRecursion {
	public boolean isMatch(String s, String p) {
		
		System.out.println("isMatch("+s+","+p+")");
		if (p.length() == 0) {
			return s.length() == 0;
		}
		if (p.length() > 1 && p.charAt(1) == '*') { // second char is '*'
			if (isMatch(s, p.substring(2))) {
				return true;
			}
			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
				return isMatch(s.substring(1), p);
			}
			return false;
		} else { // second char is not '*'
			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
				return isMatch(s.substring(1), p.substring(1));
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularExpressionMatchRecursion match = new RegularExpressionMatchRecursion();
		boolean result = match.isMatch("mississippi", "mis*is*p*.");
		System.out.print("***"+result);
		
	}
}
