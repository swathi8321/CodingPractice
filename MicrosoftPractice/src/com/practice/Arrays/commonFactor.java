package com.practice.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class commonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String[] intValues = br.readLine().split(" ");

			int firstNumer = Integer.parseInt(intValues[0]);
			int secondNumber = Integer.parseInt(intValues[1]);
			int count = 0;

			int max = (firstNumer > secondNumber ? firstNumer : secondNumber);
			for (int i = 1; i < max; i++) {
				if ((firstNumer % i) == 0) {
					if (secondNumber % i == 0) {
						count++;
					}
				}
			}

			System.out.println(count);

		} catch (NumberFormatException | IOException e) {
			// Invalid Number
			e.printStackTrace();
			System.out.println(0);
		}

	}

}
