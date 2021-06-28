package com.practice.backtracking;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class phoneDirectory {

	Map<String,String> mp = new HashMap<String,String>();
	public void buildMap() {
		
		mp.put("2","abc");
		mp.put("3","def");
		mp.put("4","ghi");
		mp.put("5","jkl");
		mp.put("6","mno");
		mp.put("7","pqrs");
		mp.put("8","tuv");
		mp.put("9","wxyz");
		
		
	}
	 public List<String> letterCombinations(String digits) {
		 List<String> result = new ArrayList<String>();
		 buildMap();
		// result = letterCombinationsHelper(digits,"",result);
		 char[] arr = new char[digits.length()];
		 result = letterCombinationsHelper1(digits,arr,0,result);
		 return result;
	        
	    }
	public List<String>  letterCombinationsHelper(String digits, String choices, List<String> result){
		
		System.out.println("letterCombinationsHelper("+digits+","+choices+","+result+")");
		if(digits.length() == 0) {
			return result;
		}
		if(digits.length() == 1 && digits.charAt(0)=='a') {
			return result;
		}
		if(digits.length()==1) {
			
			String temp = mp.get(digits.substring(0,1));
			
			for(int i=0;i<temp.length();i++) {
				
				String res =  temp.substring(i,i+1) + choices ;			
				result.add(res);
				
			}
			
			return result;
		}
		
		String choice = mp.get(digits.substring(1,2));
		
		for(int i=0;i<choice.length();i++) {
			
			letterCombinationsHelper(digits.substring(i,i+1),choice.substring(i,i+1),result);
		}
		
			
		return result;
	}
	
	public List<String> letterCombinationsHelper1(String digits,char[] choice,int index,List<String> result) {
		 String tab = "";
		    for (int i = 0; i < index ; i++) {
		        tab += "\t";
		    }
		
		System.out.println(tab + "letterCombinationsHelper1(" + digits + "," + choice[0] + " " + choice[1] +" "+choice[2]+"," + result + ")");

		if (index == digits.length()) {
			
			result.add(new String(choice));
			
			
		} else {
			//choose
			String number = digits.substring(index,index+1);
			char[] candidates = mp.get(number).toCharArray();
			
			//explore
			for(int i=0;i<candidates.length;i++) {
				
				choice[index] = candidates[i];				
				letterCombinationsHelper1(digits,choice,index+1,result);
			}
		}
		if ((result.size()==1)&&(result.get(0)== "")) result.clear();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phoneDirectory pd = new phoneDirectory();
		List<String> result = pd.letterCombinations("234");
		System.out.print("***"+result);
		
	}

}
