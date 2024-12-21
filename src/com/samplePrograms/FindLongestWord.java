package com.samplePrograms;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindLongestWord {

	public static void main(String[] args) {
		String str = "I am interested to grow in my organization";

		String result = Stream.of(str.split(" "))
				.max(Comparator.comparing(String::length))
				.get();
		
		System.out.println(result);
	}

}
