package com.programs;

import java.util.Arrays;

public class RearrangeSmallestPossible {

	/*
	 * Given a numeric array , re arrange the elements to form a smallest possible
	 * value.
	 * 
	 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
	 * 
	 * output is: 133444576998
	 */
	public static void main(String[] args) {
		int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
		
		Arrays.stream(arr).mapToObj(i-> i).sorted().forEach(System.out::print);
	}

}
