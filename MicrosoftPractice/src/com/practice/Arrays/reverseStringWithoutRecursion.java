package com.practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseStringWithoutRecursion {
	
	public String reverseWords1(String s) {
		String[] result=s.split("\\s+");
		
		for(int i=0;i<result.length/2;i++) {
			String temp = result[i];
			result[i]=result[(result.length-1)-i];
			result[(result.length-1)-i]=temp;
			
		}
		//System.out.println(result);
		s = String.join(" ", result);
		return s;
	}
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
		reverseStringWithoutRecursion r = new reverseStringWithoutRecursion();
		String str = r.reverseWords1("the sky is blue");
		System.out.println(str);


	}

}
