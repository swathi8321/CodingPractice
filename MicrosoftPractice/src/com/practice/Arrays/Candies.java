package com.practice.Arrays;

import java.util.ArrayList;
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
