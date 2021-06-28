package com.practice.Arrays;

public class reverseCharacter {
	
public void reverseWords(char[] s) {
        
        if(s.length == 0)
        {
            return;
        }
        
       reverse(s,0,s.length-1);
       System.out.println(new String(s));
        int start =0;
        int end=0;
        
        for(int i=0;i<s.length;i++)
        {
            if(start<=end && s[i]==' ')
            {
                end = i-1;
                reverse(s,start,end);
                start = i+1;
               
            }
            end++;
        }
      reverse(s,start,s.length-1);
     
    }
    
    public void reverse(char[] s,int start,int end){
    	
    	while(start<=end) {
        
        char temp = s[start];
        s[start++] = s[end];
        s[end--] = temp;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseCharacter c= new reverseCharacter();
		char input[] = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		c.reverseWords(input);
		System.out.println(new String(input));
	}

}
