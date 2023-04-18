package com.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Findvowels {

	public static void main(String[] args) {

		String input = "The quick brown fox jumps right sdsfsfdd over the little lazy dog.";
		// output: quick, over, little
		// a e i o u
		findWordsWithMaxVowelOccurrence(input);
		Function<String, Long> c = t -> t.chars().filter(d -> d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')
				.count();

		Map<String, Long> VowelsCount = Stream.of(input.split(" ")).collect(Collectors.toMap(x -> x, x -> c.apply(x)));

		Long highestValue = VowelsCount.entrySet().stream()
				.max(Comparator.comparingLong(x -> ((Entry<String, Long>) x).getValue())).map(v -> v.getValue()).get();

		Map<Long, Set<String>> results = VowelsCount.entrySet().stream().collect(
				Collectors.groupingBy(x -> x.getValue(), Collectors.mapping(x -> x.getKey(), Collectors.toSet())));

		if (results.containsKey(highestValue)) {
			//System.out.println(results.get(highestValue));
		}

	}

	static void findWordsWithMaxVowelOccurrence(String str) {
		Map<String, Integer> collect = Arrays.stream(str.split(" "))
				.collect(Collectors.toMap(e -> e, e -> e.replaceAll("[^aeiouAEIOU]", "").length()));
		Integer value = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
		collect.forEach((key, value1) -> {
			if (Objects.equals(value1, value)) {
				//System.out.println(key);
			}
		});
	}
	/*
	 * static Long checkVowelsCount(String str) {
	 * 
	 * char[] ch = str.toCharArray(); int count = 0; for (int i = 0; i < ch.length;
	 * i++) { if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' ||
	 * ch[i] == 'u') { count++; } } // return count; return c.apply(str); }
	 */
}
