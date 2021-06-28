package com.interview.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public List<String> generateParenthesis(int n) {

		List<String> result = new ArrayList<String>();

		int open = n;
		int close = n;

		String paren = "";

		generateParenHelper(open, close, paren, result);
		return result;
	}

	void generateParenHelper(int open, int close, String paren, List<String> result) {

		if (open == 0 && close == 0) {
			result.add(paren);
			// return;
		}

		if (open != 0) {

			// paren = paren + "(";
			generateParenHelper(open - 1, close, paren + "(", result);

		}

		if (close > open) {
			// paren = paren + ")";
			generateParenHelper(open, close - 1, paren + ")", result);

		}

		return;

	}

}
