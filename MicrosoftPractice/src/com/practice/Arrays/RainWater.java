package com.practice.Arrays;

public class RainWater {
	
	public int trap(int[] height) {
        
        //find left max and right max
        int left_max =0;
        int right_max =0;
        
        int[] left_max_arr = new int[height.length];
        int[] right_max_arr = new int[height.length];
       
        int sum =0;
        
        for(int i=0;i<height.length;i++){
            
            int back_num = (height.length-i)-1;
            
            left_max_arr[i] = height[i]>left_max?height[i]:left_max;
            right_max_arr[back_num] = height[back_num]>right_max?height[back_num]:right_max;
            
            
        }
         for(int i=0;i<height.length;i++){
             
             sum = sum + (Math.min(left_max_arr[i],right_max_arr[i]) - height[i]);
             
         }
        
        return sum;
    }

}
