package com.practice.Arrays;

public class ReverseString {

	    public String reverseWords(String s) {
	        
	        if(s.length()==0)
	        {
	            return s;
	        }
	        s=s.trim();
	        s =reverseWordsDriver(s);
	        String result1 = new String();
	        String[] result = s.split("\\s+");
	        s="";
	        for(int i=0;i<result.length;i++)
	        {
	        	result1 = reverseWordsDriver(result[i]);
	        	s += result1 + " ";
	        	 
	        }
	        
	        return s.trim();
	        
	        
	        
	    }
	    
	   
	

	private static String reverseWordsDriver(String s) {
		
		if(s.length()<=0)
		{
			return s;
		}
		 
		return reverseWordsDriver(s.substring(1,s.length())) + s.charAt(0);
 	}

	


	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String str = r.reverseWords("hello world swathi  jkklkk");
		System.out.println(str);

	}

}
