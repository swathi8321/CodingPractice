package com.practice.dynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lomgestPalindromeDynamicTest {

	@Test
	void test() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("");
		assertEquals(s,"");
	}
	
	@Test
	void test1() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("a");
		assertEquals(s,"a");
	}

	@Test
	void test2() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("bb");
		assertEquals(s,"bb");
	}
	@Test
	void test3() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("ab");
		assertEquals(s,"b");
	}
	
	@Test
	void test4() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("madam");
		assertEquals(s,"madam");
	}
	
	@Test
	void test5() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("\"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertEquals(s,"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
	}
	
	@Test
	void test6() {
		lomgestPalindromeDynamic lps = new lomgestPalindromeDynamic();
		String s = lps.longestPalindrome("palalak");
		assertEquals(s,"alala");
	}
}