package com.practice.slidingwindow;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * You are given an array of integers nums, 
 * there is a sliding window of size k which is moving from 
 * the very left of the array to the very right. 
 * You can only see the k numbers in the window. 
 * Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

Example 2:

Input: nums = [1], k = 1
Output: [1]

 

Constraints:

    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    1 <= k <= nums.length


 */

public class MaxSubArraySum {
	
	public long maxSubArray(int nums[],int k) {
		
		long max=Integer.MIN_VALUE;
		
		int start=0;
		int end=0;
		int sum = 0;
		
		while(end<nums.length) {
			
			if(end-start+1<k) {
				sum = sum + nums[end];
				end++;
			}else if(end-start+1==k) {
				max = Math.max(max,sum);
				sum=sum-nums[start];
				start++;
				end++;
			}
			
			
			
		}
		
		
		
		return max; 
		
		
	}
	
	public int[] maxSlidingWindow(int[] nums, int k) {
		List<Integer> maxList = new ArrayList<>();

		int start = 0;
		int end = 0;
		int sum = 0;

		while (end < nums.length) {

			if (end - start + 1 < k) {
				sum = sum + nums[end];
				end++;
			} else if (end - start + 1 == k) {
				maxList.add(sum);
				sum = sum - nums[start];
				start++;
				end++;
			}

		}
		return maxList.stream().mapToInt(i -> i).toArray();
	}
}
