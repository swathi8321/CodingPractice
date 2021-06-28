package com.practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseStringWithoutRecursion {
	public String reverseWords(String s) {

		if (s.length() == 0) {
			return s;
		}

		s = s.trim();
		String[] result = s.split("\\s+");

		List<String> arr = new ArrayList<String>();
		Collections.reverse(Arrays.asList(result));

		s = String.join("", result);
		
		return s;

	}

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String str = r.reverseWords("the sky is blue");
		System.out.println(str);


	}

}
