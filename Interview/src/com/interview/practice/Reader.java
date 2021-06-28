package com.interview.practice;

import java.util.HashMap;

public class Reader {

	public int read(char[] buf, int n) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		int i = 0;
		int count = 0;
		while (i < buf.length) {

			if (!hm.containsKey(buf[i])) {

				hm.put(buf[i], 0);
				count++;

			}

			i++;

		}

		return count;
	}
	
	public static void main(String[] args) {
		
		Reader r = new Reader();
		char[] arr = {'a','b','c'};
		System.out.println(r.read(arr, 4));
		
	}

}
