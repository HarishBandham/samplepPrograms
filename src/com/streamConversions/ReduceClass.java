package com.streamConversions;

import java.util.Arrays;

public class ReduceClass {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = Arrays.stream(numbers).reduce(0, (a,b)->a+b);
		int sum1 = Arrays.stream(numbers).reduce(0, Integer::sum);
		
		int max =Arrays.stream(numbers).reduce(0,  Integer::max);
		System.out.println("sum value - "+sum);
		System.out.println(sum1);
		
		System.out.println("max value -"+max);
	}

}
