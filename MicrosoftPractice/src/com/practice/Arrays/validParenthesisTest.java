package com.practice.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class validParenthesisTest {
	
	
	validParenthesis v = new validParenthesis();
	

	@Test
	void test() {
		String s = "";
		boolean x = v.isValid(s);
		assertEquals(x,true);
	}

	@Test
	void test1() {
		String s = "()";
		boolean x = v.isValid(s);
		assertEquals(x,true);
	}
	
	@Test
	void test2() {
		String s = "()[]{}";
		boolean x = v.isValid(s);
		assertEquals(x,true);
	}
	@Test
	void test3() {
		String s = "(]";
		boolean x = v.isValid(s);
		assertEquals(x,false);
	}
	
	@Test
	void test4() {
		String s = "([)]";
		boolean x = v.isValid(s);
		assertEquals(x,false);
	}
	
	@Test
	void test5() {
		String s = "{[]}";
		boolean x = v.isValid(s);
		assertEquals(x,true);
	}
}
