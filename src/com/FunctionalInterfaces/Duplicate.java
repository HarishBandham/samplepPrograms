package com.FunctionalInterfaces;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {

		String str = "kakatua parrot is a bird";
		
		
		Map<Character,Long> fre = 
				str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(
						Function.identity(),Collectors.counting()));
		
		System.out.println(fre);
	}

}
