package com.practice.backtracking;

import java.util.ArrayList;
import java.util.List;

public class wordSearch {
	class TrieNode{
		TrieNode[] next = new TrieNode[26];
		String word;
	}
	
	public TrieNode buildTrie(String[] words) {
		TrieNode root = new TrieNode();
		
		//here traverse each word
		for(String w:words) {
			
			TrieNode passTrieNode = root;
			
			//here traverse the word character by character
			for(char c:w.toCharArray()) {
				if(passTrieNode.next[c-'a']== null) {
					passTrieNode.next[c-'a'] = new TrieNode();
				}
				passTrieNode = passTrieNode.next[c-'a'];
			}
			passTrieNode.word = w;
		}
		return root;
	}
	
	public void dfs(char[][] board, int i, int j, TrieNode root, List<String> result) {
		
		char c = board[i][j];
		
		if(c == '#' || root.next[c-'a'] ==  null )  return;
		
		root = root.next[c-'a'];
		
		if(root.word != null) {
			result.add(root.word); //found 
			root.word = null; //deduplicate
		}
		
		board[i][j] = '#'; //visited
		
		//now loop into all directions
		if(i>0) dfs(board,i-1,j,root,result);
		if(j>0) dfs(board,i,j-1,root,result);
		if(i<board.length -1) dfs(board,i+1,j,root,result);
		if(j<board.length -1) dfs(board,i,j+1,root,result);
		
		board[i][j] = c; //mark back 
		
	}
	
	public List<String> findWords(char[][] board, String[] words) {

		// Use Trie to build set of words
		TrieNode root = buildTrie(words);

		// store in result
		List<String> result = new ArrayList<String>();

		// search board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				dfs(board, i, j, root, result);
			}
		}

		return result;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/* Notes
https://www.geeksforgeeks.org/advantages-trie-data-structure/
Why Trie? :-

With Trie, we can insert and find strings in O(L) time where L represent the length of a single word. This is obviously faster than BST. This is also faster than Hashing because of the ways it is implemented. We do not need to compute any hash function. No collision handling is required (like we do in open addressing and separate chaining)
Another advantage of Trie is, we can easily print all words in alphabetical order which is not easily possible with hashing.
We can efficiently do prefix search (or auto-complete) with Trie.

The final conclusion is regarding tries data structure is that they are faster but require huge memory for storing the strings.

board.length is j is kept then it fails for this condition:
[["a","b"]]
["ab"]
*/