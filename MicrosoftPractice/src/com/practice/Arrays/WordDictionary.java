package com.practice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class WordDictionary {

    /** Initialize your data structure here. */
    Set<String> dict;
     List<String> dict1;
    public WordDictionary() {
            dict = new HashSet<String>();     
             dict1 = new ArrayList<String>();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        dict.add(word);
        dict1.add(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	public boolean search(String word) {

		if (word.contains(".")) {
			
			for (String pWord : dict1) {
				if (word.length() == pWord.length()) {

					char[] cword = word.toCharArray();
					char[] pword = pWord.toCharArray();

					if(cword.length == 1) {
						return true;
					}
					for (int i = 0; i < word.length(); i++) {
						if (cword[i] == '.') {
							i++;
						}
						
						if (i<cword.length && cword[i] == pword[i]) {
							return true;
						}
					}
				}
			}
			return false;

		}
		if (dict.contains(word)) {
			return true;
		}
		return false;

	}
    
    public static void main(String[] args) {
    	WordDictionary w = new WordDictionary();
    	w.addWord("a");
    	w.addWord("ab");
    	//w.addWord("aa");
    	//w.addWord(".a");
    	//w.addWord("a.");
    	
    	System.out.println(w.search("."));
	}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
