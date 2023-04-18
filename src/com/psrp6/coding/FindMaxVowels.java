package com.psrp6.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxVowels {

	public static void main(String[] args) {
		
		String str =  "The quick brown fox jumps right over the little lazy dog.";
		Function<String,Integer> lengthOfVowels = e -> e.replaceAll("[^aeiouAEIOU]","").length();
		Map<Integer,Set<String>> result = 
				Arrays.stream(str.split(" "))
				.collect(
						Collectors.groupingBy(
						x -> lengthOfVowels.apply(x),
						Collectors.mapping(Function.identity(), Collectors.toSet())
						)
				);
		
		result.forEach((key,value)->{
			if(key>1) {
				System.out.println(value);
			}
		});

	}

}
