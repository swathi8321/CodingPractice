package com.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Java8Feature {

	public static void main(String args[]) {
		 List<Integer> number = Arrays.asList(2,3,4,5); 
		 Integer result = number.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		List<Integer> square = number.stream()
								.map(x -> x*x) 
								.collect(Collectors.toList()); 
			System.out.println(square); 
			System.out.println(result); 
	}
	
}
