package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//find duplicate in array
//find whether 2 strings are anagrams
//find whether given string is palindrome
//best buy sell stocks
//reverse a string
//reverse a number

public class PracticeArrays {

	public boolean findDuplicate(int arr[]) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			// System.out.println("array element is "+arr[i]);
			if (mp.get(arr[i]) == null) {
				mp.put(arr[i], 1);
			} else {
				// System.out.println("***array element is "+arr[i]);
				return true;
			}

		}

		return false;

	}

	public List<Integer> removeDuplicates(int[] arr) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) == 1) {
				list.add(arr[i]);
			}
		}

		return list;

	}

	public int maxNumberList(String str) {

		String[] arr = str.split(",");
		Map<String, Integer> mp = new HashMap<String, Integer>();

		int max = 0;
		int count = 0;
		int maxNumber = 0;

		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], count++);
			if (max < mp.get(arr[i])) {
				max = mp.get(arr[i]);
				maxNumber = arr[i].isEmpty() ? maxNumber : Integer.parseInt(arr[i]);
			}
		}

		return maxNumber;

	}

	public List<Integer> findSalary(String str) {

		String[] arr = str.split(",");
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].isEmpty()) {
				if (Integer.parseInt(arr[i]) % 2 == 0) {
					list.add(Integer.parseInt(arr[i]));
				}
			}
		}

		return list;

	}

	public boolean isAnagram(String str1, String str2) {
		char[] str1arr = str1.toCharArray();
		char[] str2arr = str2.toCharArray();

		Arrays.sort(str1arr);
		Arrays.sort(str2arr);

		if (!Arrays.equals(str1arr, str2arr)) {
			return false;
		}
		return true;
	}

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums2.length; i++) {

			mp.put(nums2[i], mp.getOrDefault(nums2[i], 0) + 1);

		}

		for (int i = 0; i < nums1.length; i++) {
			if (mp.getOrDefault(nums1[i], 0) > 0) {
				result.add(nums1[i]);
			}

		}

		int[] r = new int[result.size() - 1];
		for (int i = 0; i < result.size(); i++) {
			r[i] = result.get(i);
		}

		return r;

	}

	public int binarySearch(int arr[], int searchElement) {

		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		while (high > low) {
			mid = (low + high) / 2;
			if (searchElement > arr[mid]) {
				high++;
			} else if (searchElement > arr[mid]) {
				low--;
			} else if (searchElement == arr[mid]) {
				return mid;
			}

		}
		return -1;

	}

	public boolean isPalindrome(String s1) {

		char[] word1 = s1.toCharArray();

		for (int i = 0; i < (word1.length) / 2; i++) {

			if (word1[i] != word1[(word1.length - 1) - i]) {
				return false;
			}

		}

		return true;

	}

	public int maxProfit(int[] prices) {

		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {

			if (prices[i] > prices[i - 1]) {

				maxProfit += (prices[i] - prices[i - 1]);

			}

		}

		return maxProfit;
	}

	public int reverseNumber(int num) {

		int reverseNum = 0;

		while (num > 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;

			num = num / 10;
		}

		return reverseNum;

	}

	public String reverseString(String str) {

		char[] word = str.toCharArray();

		for (int i = 0; i < (word.length); i++) {
			word[i] = str.charAt((word.length - 1) - i);

		}

		return new String(word);

	}

	// find first norepeating character

	public char firstNonRepeating(String str) {

		char result = 0;

		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {

			mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0) + 1);

		}

		for (int i = 0; i < str.length(); i++) {

			if (mp.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}

		return result;

	}

	public String removeAtChar(String str, String remove) {

		Boolean[] flag = new Boolean[128];

		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();

		for (int i = 0; i < s.length; i++) {
			flag[s[i]] = false;
		}
		for (int i = 0; i < r.length; i++) {
			flag[r[i]] = true;
		}

		int dist = 0;

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			if (!flag[s[i]]) {
				s[dist++] = s[i];
			}
		}

		return new String(s, 0, dist);

	}

	public int[] plusOne(int[] digits) {

		int carry = 0;

		reverse(digits, 0, digits.length - 1);

		for (int i = 0; i < digits.length; i++) {

			int result = digits[i] + 1;

			if (result > 0) {
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = carry + digits[i];
				carry = 0;
			}

		}

		reverse(digits, 0, digits.length - 1);
		return digits;

	}

	public void reverse(int[] digits, int start, int end) {
		while (start < end) {
			int temp = digits[start];
			digits[start] = digits[end];
			digits[end] = temp;
			start++;
			end--;

		}
	}

	public boolean isPallindrom(String str) {
		char[] arr = str.toCharArray();
		int length = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] == (arr[length - i]))) {
				return false;
			}
		}

		return true;

	}

	public static void main(String args[]) {

		PracticeArrays pracA = new PracticeArrays();

		boolean result = pracA.isAnagram("eat", "hello	");
		System.out.println("anagram it should be true" + result);

		int[] arr = { 1, 3, 6, 1, 8, 9 };
		result = pracA.findDuplicate(arr);
		System.out.println("it should be true" + result);

		result = pracA.isPalindrome("hello");
		System.out.println("it should be false" + result);

		int[] prices = { 1, 2, 3, 4, 5 };
		int maxprofit = pracA.maxProfit(prices);
		System.out.println("it should be 4 " + maxprofit);

		int reverseNum = pracA.reverseNumber(78965);
		System.out.println("Ip:78965 -> it should be 56987 " + reverseNum);

		String reverseStr = pracA.reverseString("helloworld");
		// assert(reverseStr.equals("dlrowolleh"));
		System.out.println("it should be dlrowolleh " + reverseStr);

		char resultC = pracA.firstNonRepeating("hhhjjjjkklloopqr");
		System.out.println("it should be p " + resultC);

		String resultStr = pracA.removeAtChar("missisippi", "aeiou");
		System.out.println("it should be mssspp " + resultStr);

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 2, 4, 5, 6, 8, 9 };
		int resultInt = pracA.binarySearch(arr1, 6);
		System.out.println("it should be 5 " + resultInt);

		System.out.println("list is  " + pracA.removeDuplicates(arr1));
		System.out.println("Max is  " + pracA.isPallindrom("madam"));
	}

}
