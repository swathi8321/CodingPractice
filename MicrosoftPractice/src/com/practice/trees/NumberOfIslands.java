package com.practice.trees;

public class NumberOfIslands {
	
	private int x;
	private int y;
	
	
	
	public int numIslands(char[][] grid) {
		
		int count = 0;
		int x =  grid.length;
		if(x== 0) {
			return 0;
		}
		
		int y = grid[0].length;
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(grid[i][j]== '1') {
					dfs(grid,i,j);
					++count;
				}
			}
		}
		
		return count;
		
 	}
	
	public void dfs(char[][] grid,int i,int j) {
		if(i<0||j<0||i>grid.length||j>grid[0].length||grid[i][j]!='1') {
			return;
		}
		
		grid[i][j]='0';
		dfs(grid,i-1,j);
		dfs(grid,i,j-1);
		dfs(grid,i+1,j);
		dfs(grid,i,j+1);
	}

}
