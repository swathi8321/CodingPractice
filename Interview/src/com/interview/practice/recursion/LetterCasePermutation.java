package com.interview.practice.recursion;


import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public List<String> letterCasePermutation(String s) {
		String op = "";

		List<String> arrList = new ArrayList<>();
		change(s, op, arrList);

		return arrList;
	}

	private static void change(String ip, String op, List<String> arrList) {

		if (ip.isEmpty()) {
			if (!arrList.contains(op)) {
				arrList.add(op);
			}
			return;

		}

		String op1 = op;
		String op2 = op;
		String ip_ = "";
		ip_ += ip.charAt(0);
		op1 += ip_.toLowerCase();
		op2 += ip_.toUpperCase();
		ip = ip.substring(1);
		
		change(ip, op1, arrList);
		change(ip, op2, arrList);

	}

}
