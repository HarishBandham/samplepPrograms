package com.streamConversions;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToString {

	public static void main(String[] args) {

		String str = "I love my country";
		String[] s1 = Arrays.stream(str.split(" ")) //Stream<String>
					.map(x->x.substring(0, 1).toUpperCase()+x.substring(1,x.length()))
					.toArray(String[]::new);
						
		Stream.of(s1).forEach(System.out::println);	
		
		System.out.println("\n--------IntStream to Integer[] --------------\n");
		//convert IntStream to Integer[] or int[]
		
		int[] num = {1, 2, 3, 4, 5};
		
		Integer[] i = Arrays.stream(num).boxed()
					.toArray(Integer[]::new);
		
		Stream.of(i).forEach(System.out::println);	
		
		System.out.println("\n--------IntStream  int[]--------------\n");
		int[] elemens = Arrays.stream(num) //convert to IntStream
						.boxed()
						.mapToInt(x->x)
						.toArray();
		System.out.println(Arrays.toString(elemens));
 		}
	
}
