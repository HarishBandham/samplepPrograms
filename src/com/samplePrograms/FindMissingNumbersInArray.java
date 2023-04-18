package com.samplePrograms;

import java.util.Arrays;

public class FindMissingNumbersInArray {

	public static void main(String[] args) {
		
		int fromRange = 3;
		int toRange = 15;
		//int input[] = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		int[] register = new int[toRange];
		
		int[] input = {4,6,14,8};
		for (int i : input) {
			register[i] = 1;
		}

		for (int i = fromRange; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}


			
		System.out.println(Arrays.toString(register));
	}

}
