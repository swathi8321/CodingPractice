package com.practice.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class MinimumNumber {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int arraylength = Integer.parseInt(br.readLine());
			String[] intValues = br.readLine().split(" ");
			int sampleInput[]= new int[arraylength+1];
			
			for(int i=0;i<arraylength;i++) {
				sampleInput[i] = Integer.parseInt(intValues[i]);
			}
			Arrays.sort(sampleInput);
			int max = 0;
			for(int i=0;i<=arraylength;i++) {
				max += sampleInput[i];
			}
			
			for(int i=0;i<=arraylength;i++) {
				if((arraylength*sampleInput[i]) > max) {
					System.out.print(sampleInput[i]);
					break;
				}
			}			

		} catch (NumberFormatException | IOException e) {
			// Invalid Number
			e.printStackTrace();
			System.out.println(0);
		}
	}

}
