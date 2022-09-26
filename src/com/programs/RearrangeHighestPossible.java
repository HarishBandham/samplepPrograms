package com.programs;

import java.util.Arrays;
import java.util.Collections;

public class RearrangeHighestPossible {
	/*
	 * Given a numeric array , re arrange the elements to form a highest possible
	 * value.
	 * 
	 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
	 * 
	 * output is: 998764543431
	 */
	public static void main(String[] args) {

		int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
		
		 Arrays.stream(arr).mapToObj(e->e+"")
				.sorted(Collections.reverseOrder()).forEach(System.out::print);
		
	}

}
