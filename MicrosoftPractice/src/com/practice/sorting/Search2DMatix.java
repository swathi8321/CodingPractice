package com.practice.sorting;

public class Search2DMatix {
	
	public boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;
		if (n == 0)
			return false;

		int m = matrix[0].length;

		int start = 0;
		int end = matrix[0].length - 1;

		while (start < n && end >= 0) {

			int mid = matrix[start][end];

			if (target == mid) {
				return true;
			} else if (target > mid) {

				start++;
			} else {
				end--;
			}

		}

		return false;

	}
	 
	 public boolean searchMatrix1(int[][] matrix, int target) {
         int i = 0, j = matrix[0].length - 1;
         while (i < matrix.length && j >= 0) {
                 if (matrix[i][j] == target) {
                     return true;
                 } else if (matrix[i][j] > target) {
                     j--;
                 } else {
                     i++;
                 }
             }
         
         return false;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search2DMatix s = new Search2DMatix();
		int[][] arr = {{1,3}};
		System.out.println(s.searchMatrix(arr, 3));

	}

}
