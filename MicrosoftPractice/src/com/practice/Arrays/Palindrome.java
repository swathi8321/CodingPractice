package com.practice.Arrays;

public class Palindrome {

	public boolean isPalindromeAdvanced(String s) {

		if (s.length() == 0 || s.length() == 1) {
			return true;
		}

		int head = 0;
		int tail = s.length() - 1;

		char cHead;
		char cTail;

		while (head < tail) {

			cHead = s.charAt(head);
			cTail = s.charAt(tail);

			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}

		}

		return true;

	
	}
	public boolean isPalindrome(String s) {

		if (s.length() == 0 || s.length() == 1) {
			return true;
		}

		String newString = new String();

		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {

				newString = newString.concat(Character.toString(s.charAt(i)));

			}

		}
		System.out.println(newString);
		for (int i = 0; i < newString.length(); i++) {

			if (Character.isAlphabetic(newString.charAt(i))) {
				if (Character.toLowerCase(newString.charAt(i)) != Character
						.toLowerCase(newString.charAt((newString.length() - 1) - i))) {
					return false;
				}
			}
			if (Character.isDigit(newString.charAt(i))) {
				System.out.println(newString.charAt(i));
				System.out.println(newString.charAt((newString.length() - 1) - i));
				if (newString.charAt(i) != newString.charAt((newString.length() - 1) - i)) {
					return false;
				}
			}
		}

		return true;

	}
	
	public static void main(String[] args) {
		
		Palindrome s = new Palindrome();
		boolean x = s.isPalindrome("1b1");
		System.out.println(x);
		
	}

}
