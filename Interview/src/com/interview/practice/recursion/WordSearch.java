package com.interview.practice.recursion;

public class WordSearch {
	
	 public boolean exist(char[][] board, String word) {
	        int n =0;
	        int r = board.length;
	        int c = board[0].length;
	        return helper(board,word,r-1,c-1, n);
	        
	    }
	    
	    public boolean helper(char[][] board,String word,int r,int c,int n){
	        
	        if(r<0||c<0||r>=board.length||c>=board.length){
	            return false;
	        }
	        
	        if(n==word.length()){
	            return true;
	        }
	        
	        if(board[r][c]==word.charAt(n)){
	            
	          return   helper(board,word,r-1,c,n-1) ||
	            helper(board,word,r+1,c,n-1) ||
	            helper(board,word,r,c-1,n-1) ||
	            helper(board,word,r,c+1,n-1);
	            
	        }else{
	            return false;
	        }
	        
	    }
}
