package com.practice.Arrays;

import java.util.Stack;

public class validParenthesis {
	
	public boolean isValid(String s) {

		if (s.length() == 0) {
			return true;
		}

		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '{') {

				stk.push('}');	
			}else if(s.charAt(i) == '(') {
				
				stk.push(')');	
				
			}else if(s.charAt(i) == '[') {
				
				stk.push(']');	

			} else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {

				char c = stk.pop();
				System.out.println(c);
				if (c != s.charAt(i)) {
					return false;
				}

			}
		}
		if(stk.isEmpty()){
			return true;
	        }else{
	            return false;
	        }
	}
}
