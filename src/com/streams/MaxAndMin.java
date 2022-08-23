package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxAndMin {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,9,5);
		
		int maxValue = list.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("MAxvalue "+maxValue);
		
		int minValue =list.stream().min(Comparator.naturalOrder()).get();
		System.out.println("min value "+minValue);
		
		System.out.println(
		list.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).findFirst().get()
		);
		
		System.out.println("\n---------------\n");
		List<Integer> one = Arrays.asList(1, 2, 3);
		List<Integer> two = Arrays.asList(4, 5, 6);
		Stream.concat(one.stream(), two.stream())
		       // .peek(System.out::print)
		        .forEach(System.out::println);
		
		
	}

}
