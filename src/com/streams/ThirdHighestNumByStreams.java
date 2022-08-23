package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ThirdHighestNumByStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = Stream.of(23, 11, 96, 33)
		.sorted(Comparator.reverseOrder())
		.distinct().limit(3).skip(2).findFirst().get();
		
		List<Integer> listInt =Arrays.asList(23, 11, 96, 33);
		listInt.stream()
				.sorted(Comparator.reverseOrder())
				.distinct().limit(3).skip(2)
				.forEach(System.out::println);
	}

}
