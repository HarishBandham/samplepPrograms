package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeatEle {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(
				Arrays.asList(76, 3, 45, 56, 76, 9, 76, 45,0, 3 ));
		
		int nonOccurrence = list.stream()
				.filter(i->Collections.frequency(list, i)==1)
				.findFirst().get();
		
		System.out.println(nonOccurrence);
	}

}
