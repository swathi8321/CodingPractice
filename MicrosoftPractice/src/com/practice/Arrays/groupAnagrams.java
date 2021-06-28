package com.practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
	
	
	    public List<List<String>> groupAnagrams1(String[] strs) {
	        
	        Map<String,List<String>> mp = new HashMap<String,List<String>>();
	        
	        
	        for(int i=0;i<strs.length;i++){
	        	char[] tempChar = strs[i].toCharArray();
	        	Arrays.sort(tempChar);
	        	;
	            if(mp.get(new String(tempChar)) == null  ){
	            	
	                List<String> lsLinked = new ArrayList<String>();
	                lsLinked.add(strs[i]);
	                mp.put(new String(tempChar),lsLinked);   
	              
	                
	            }else{
	            	
	                List<String> exitingList = new ArrayList<String>();
	                exitingList =	mp.get(new String(tempChar));
	                exitingList.add(strs[i]);
	                mp.put(new String(tempChar),exitingList);
	            }
	        }
	        
	        List<List<String>> result = new ArrayList<List<String>>();
	        
	        for(List<String> s : mp.values()) {
	            
	            result.add(s);
	        }
	        
	        return result;
	    }
	    
	   
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList();
		}

		Map<String, List> mp = new HashMap<String, List>();

		for (String str : strs) {

			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);

			if (!mp.containsKey(key)) {
				mp.put(key, new ArrayList());
			}

			mp.get(key).add(str);
		}

		return new ArrayList(mp.values());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> result = new ArrayList<List<String>>();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams g = new groupAnagrams();
		//result = g.groupAnagrams1(strs);
		result = g.groupAnagrams(strs);
		
//		for(int i=0;i<result.size();i++) {
//			List<String> s = new ArrayList<String>();
//					s = result.get(i);
//			for(int j=0;j<s.size();j++) {
//			System.out.println(s.get(j));
//			}
//			System.out.println("********");
//			
//		}
//		

		System.out.println(result);
	}

}
