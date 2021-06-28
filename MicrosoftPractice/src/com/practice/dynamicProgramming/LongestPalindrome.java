package com.practice.dynamicProgramming;

public class LongestPalindrome {

	public String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		if (s.length() == 2) {
			char str[] = s.toCharArray();
			if (str[0] == str[1]) {
				return s;
			} else {

				return s.substring(0, 1);

			}
		}
		String longPal[] = new String[s.length()];
		String longPalstr = "";

		for (int i = 0; i < s.length() - 1; i++) {
			// System.out.println(s.substring(i, s.length()));

			stringHelper(s.substring(i, s.length()), 0, longPal);

		}

		for (int i = 0; i < longPal.length; i++) {
			if (longPal[i] != null) {

				char[] tmp = longPal[i].toCharArray();
				int max = 0;

				if (tmp.length > max) {

					max = tmp.length;
					longPalstr = new String(tmp);

				}
			}
		}
		if (longPalstr == "" && s.length()>2) {
			longPalstr = s.substring(0, 1);
		}
		return longPalstr;
	}

public String[] stringHelper(String s, int pos, String[] longPal) {
	char[] str = s.toCharArray();
	int l = s.length();
	String[] arr = new String[1000];
	for (int i = l - 1; i > 0; i--) {

		if (str[pos] == str[i]) {

			boolean flag = true;
			int temp = i;

			for (int k = pos; k < i; k++) {

				if (str[k] != str[temp]) {
					flag = false;
					break;
				}
				temp--;

			}
			if (flag) {

				arr[i - pos] = s.substring(pos, i + 1);
				longPal[i - pos] = s.substring(pos, i + 1);
			}

		}

	}
	
	return arr;
}

	public static void main(String[] args) {
		LongestPalindrome l = new LongestPalindrome();
		String str = l.longestPalindrome("abcade");
		System.out.println(str);

	}

}
