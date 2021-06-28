package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

class Logger {

    /** Initialize your data structure here. */
    private Map<String,Integer> mp ;
    public Logger() {
        
       mp = new HashMap<String,Integer>();
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        int time = this.mp.getOrDefault(message,-1);
       
               
        if(timestamp-time>=10 || time == -1) {
        	mp.put(message,timestamp);
        	return true;
        }else {
        	
        	return false;
        }
        
        
    }
    private final int NUMBER = 4;
    public boolean isPowerOfFour(int num) {
    	
    	if(num == 0) {
    		return false;
    	}
        
        while(num != 1){
            if(!(num%NUMBER == 0)){
                return false;
            }
            num = num/NUMBER;
        }
        
        return true;
        
    }
    
    public static void main(String args[]) {
    	
    	Logger obj = new Logger();
    	boolean param_1 = obj.isPowerOfFour(5);
    	System.out.println(param_1);
    	 param_1 = obj.shouldPrintMessage(2,"foo");
    	 System.out.println(param_1);
    	 param_1 = obj.shouldPrintMessage(11,"foo");
    	 System.out.println(param_1);
    }
    
}


