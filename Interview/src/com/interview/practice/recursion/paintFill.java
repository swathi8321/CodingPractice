package com.interview.practice.recursion;

public class paintFill {
	
	 public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	        
	        if(image[sr][sc] == newColor){
	            return image;
	        }
	        
	       fillHelper(image,sr,sc,image[sr][sc],newColor);
	        return image;
	        
	    }
	    
	    public void fillHelper(int[][] image, int sr, int sc,int oldColor, int newColor) {
	     
	        if(sr<0 || sc<0 || sr >= image.length || sc >= image[0].length){
	            return ;
	        }
	        
	        if(image[sr][sc] == oldColor){
	            image[sr][sc] = newColor;
	            fillHelper(image,sr-1,sc,oldColor,newColor);
	            fillHelper(image,sr+1,sc,oldColor,newColor);
	            fillHelper(image,sr,sc-1,oldColor,newColor);
	            fillHelper(image,sr,sc+1,oldColor,newColor);
	        }
	       // return image;
	    }
	    

}
