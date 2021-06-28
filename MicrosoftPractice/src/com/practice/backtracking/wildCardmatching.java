package com.practice.backtracking;

public class wildCardmatching {
	

	    public boolean isMatch(String s, String p) {
	        
	        int sIdx = 0;
	        int pIdx = 0;
	        
	        int stardx = -1;
	        int stempdx = -1;
	        
	        int sLen = s.length();
	        int pLen = p.length();
	        
	        while(sIdx<sLen){
	            if(pIdx < pLen && p.charAt(pIdx) == '?' || s.charAt(sIdx) == p.charAt(pIdx)){
	                ++sIdx;
	                ++pIdx;
	            }else if(pIdx < pLen && p.charAt(pIdx) == '*'){
	                stardx = pIdx;
	                stempdx = sIdx;
	                ++pIdx;
	            }else if(sIdx == -1){
	                return false;
	            }else{
	                pIdx = stardx + 1;
	                sIdx = stempdx + 1;
	                stempdx = sIdx;             
	                
	            }      
	            
	        }
	        
	        for(int i=pIdx;i<pLen;i++){
	            if(p.charAt(i) != '*') return false;            
	        }
	        return true;
	    }   
	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
