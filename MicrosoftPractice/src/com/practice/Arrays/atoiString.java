package com.practice.Arrays;

public class atoiString {
	
	final static int INT_MAX  = 2147483647;
	final static int INT_MIN  = -2147483648;
	
    public int myAtoi(String str) {
    	 if(str==null||str.length()==0)return 0;
         str=str.trim();
    	
        int sign = 1, base = 0, i = 0;
        while (str.charAt(i) == ' ')
            i++;
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE%10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
}

	public static void main(String[] args) {
		
		atoiString s = new atoiString();
		int result = s.myAtoi("42");
		System.out.println(result);
		
		result = s.myAtoi("   -42");
		System.out.println(result);
		
		result = s.myAtoi("4193 with words");
		System.out.println(result);
		
		result = s.myAtoi("+-789");
		System.out.println(result);
		
		result = s.myAtoi("-91283472332");
		System.out.println(result);
		

	}

}
