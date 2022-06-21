 	package com.interview.practice.basic;

public class RotatedArray {

	 public int search(int[] nums, int target) {
	 
		 int start = 0;
		 int end = nums.length-1;
		 
		 if(nums[start]<nums[end]) {
			return binarySearch(nums,target,start,end);
		 }
		 int pivot = findPivot(nums);
		 
		 if(nums[pivot] == target) {
			 return pivot;
		 }
		 System.out.println(pivot);
		 int result = binarySearch(nums,target,start,pivot-1);
		 int result1 = binarySearch(nums,target,pivot,end);
		 
		 if(result!=-1) {
			 return result;
		 }else if(result1 != -1) {
			 return result1;
		 }else {
			 return -1;
		 }
		 
	 }
	 
	private int binarySearch(int[] nums, int target, int start, int end) {
		
		while(start<end) {
			int mid = start + (end-start)/2 ;
			
			if(nums[mid]==target) {
				return mid;
			}else if(target<nums[mid]) {
				end = mid -1;
			}else if(target>nums[mid]) {
				start = mid+1;
			}
		}
		return -1;
			
			
		}
		
		
	

	public int findPivot(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		if (nums[start] < nums[end]) {
			return nums[start];
		}

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] <= nums[mid + 1] && nums[mid] <= nums[mid - 1]) {
				return mid;
			} else if (nums[mid] < nums[end]) {
				end = mid;
			} else {
				start = mid + 1;
			}

		}

		return start;

	}
	
	public int findMin(int[] nums) {
	    int left = 0;
	    int right = nums.length - 1;
	    while(left < right) {
	        int mid = left + (right - left) / 2;
	        if(nums[mid] < nums[right]) {
	            right = mid;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return nums[left];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3};
		RotatedArray r = new RotatedArray();
		System.out.println(r.search(nums,3));
		
	}
	
	public int binarySearch(int nums[],int target){

		int start=0;
		int end= nums.length-1;
		int mid = start +(end-start)/2;
		while(start<end){
			if(nums[mid]==target) return mid;
			else if(nums[mid]<target) start=mid+1;
			else if(nums[mid]>target) end=mid-1;
		
		}

		return -1;

}

}
