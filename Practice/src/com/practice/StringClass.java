package com.practice;

public class StringClass {
	
	
	
	public static void main(String[] args) {
		
		String s1= "Manipal";
		String s2="Manipal";
				
		System.out.println(s1==s2);
		
		String s3 = new String("Manipal");
		System.out.println(s1==s3);
		
		StringBuilder sb = new StringBuilder("Programming");
		sb.insert(3, sb);
		
		System.out.println(sb);
		
		String s4 = null;
		//s4=s4&s3;
		System.out.println(s4);
	}

}
