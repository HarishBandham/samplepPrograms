package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNonRepeatEle {

	public static void main(String[] args) {

		int arr[] = {5,3,4,2,1,3,2,5,4,6,8,3};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(FindNonrepeatElement(list));
		System.out.println(FindNonrepeatElements(list));
		
		//List<Integer> list = new ArrayList<>(
		//		Arrays.asList(5,3,4,2,1,3,2,5,4,6,8,3));
	}

	private static <I> List<I> FindNonrepeatElements(List<I> list) {

		List<I> nonRepeatElements = list.stream()
				.filter(i->Collections.frequency(list, i)==1)
				.collect(Collectors.toList());
		//System.out.println(nonRepeatElements);
		
		return nonRepeatElements;
	}

	private static int FindNonrepeatElement(List<Integer> list) {
		int FirstnonRepeatElemet = list.stream()
				.filter(i->Collections.frequency(list, i)==1)
				.findFirst().get();
		//System.out.println(FirstnonRepeatElemet);
		return FirstnonRepeatElemet;
	}

}
