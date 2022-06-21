package com.practice.Arrays;

import java.util.ArrayList;

/*
We distribute some number of candies, to a row of n = num_people people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and 
so on until we give n candies to the last person.

Then, we go back to the start of the row, giving n + 1 candies to the first person,
 n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time,
 and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.

 

Example 1:

Input: candies = 7, num_people = 4
Output: [1,2,3,1]
Explanation:
On the first turn, ans[0] += 1, and the array is [1,0,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0,0].
On the third turn, ans[2] += 3, and the array is [1,2,3,0].
On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
Example 2:

Input: candies = 10, num_people = 3
Output: [5,2,3]
Explanation: 
On the first turn, ans[0] += 1, and the array is [1,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0].
On the third turn, ans[2] += 3, and the array is [1,2,3].
On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
 */
import java.util.Arrays;
import java.util.List;

public class Candies {

	public List<Integer> distributeCandies(int candies, int num_people) {

		List<Integer> list = new ArrayList<Integer>();

		int j = 0;
		int sum = 0;
		int actualSum = 0;
		boolean flag = false;
		int count =1;
		
		for (int i = 0; i < candies; i++) {

			if (j == num_people) {
				j = 0;
				flag = true;
				//break;
			}

			if (!list.isEmpty()) {

				sum += list.get(i - 1);
				
				actualSum = sum + count;
				if (actualSum > candies) {

					list.add(j, candies - sum);
					break;
				}
			}
			
			if(flag) {
				System.out.println(j + "-------"+list.get(j)+"----------"+count);
				System.out.println(list);
				int temp = list.get(j)+count;
				list.remove(j);
				list.add(j, temp);
			}else {
				System.out.println(j + "-----------------"+count);
				list.add(j, count);
			}
			count++;
			j++;

		}

		int[] arr = list.stream().mapToInt(i -> i).toArray();
		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candies c = new Candies();

		System.out.println(c.distributeCandies(10,3));
		

	}

}
