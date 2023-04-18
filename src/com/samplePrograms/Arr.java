package com.samplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arr {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(0);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(21);
		
		System.out.println(list);
		Stream<Integer> i= list.stream().map(x->x*2);
	
		List<Integer> list1 = Arrays.asList(1,3,5,7,9);
		int sum = list1.stream().reduce(0, Integer::sum);
		System.out.println("sum--"+sum);
		
		List<String> list2 = Arrays.asList("ABC", "ADC","BCD", null, "PQR", "SR");
		
		List<String> result = list2.stream()
				.filter(Objects::nonNull)
				.filter(x->!(x.charAt(0) == 'A'))
				.collect(Collectors.toList());
		System.out.println("without A--"+result);
		
		String input = "Programming";
		
		Map<Character,Long> occurences = 
				input.chars().mapToObj(x->(char)x)
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue() >1)
				.collect(
						Collectors.toMap(x->x.getKey(),x->x.getValue()));
		

		System.out.println(occurences);
		findMissingNumber();
	}	
	
	static void findMissingNumber() {
		int fromRange = 3;
		int toRange = 15;
		int[] input1 = {4,6,14,8};
		int sum=0;
		for(int i=0;i<input1.length;i++) {
			sum+=input1[i];
		}
		
		 int sumtotal= (toRange*(toRange+1))/2;
		 System.out.println("sumtotal--"+sumtotal);
		System.out.println("sum--"+sum);
		System.out.println(sumtotal-sum);
	}
}
