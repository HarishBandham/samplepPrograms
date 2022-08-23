package com.programs;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Findvowels {

	public static void main(String[] args) {

		String input = "The quick brown fox jumps right sdsfsfdd over the little lazy dog.";
		// output: quick, over, little
		// a e i o u
		Stream<String> words = Stream.of(input.split(" "));

		Map<String, Long> VowelsCount = Stream.of(input.split(" ")).collect(Collectors.toMap(x -> x, x -> {
			return checkVowelsCount(x);
		}));

		Long highestValue = VowelsCount.entrySet().stream()
				.max(Comparator.comparingLong(x -> ((Entry<String, Long>) x).getValue())).map(v -> v.getValue()).get();

		Map<Long, Set<String>> results = VowelsCount.entrySet().stream().collect(
				Collectors.groupingBy(x -> x.getValue(), Collectors.mapping(x -> x.getKey(), Collectors.toSet())));

		if (results.containsKey(highestValue)) {
			System.out.println(results.get(highestValue));
		}

	}

	static Long checkVowelsCount(String str) {

		Function<String, Long> c = t -> t.chars().filter(d -> d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')
				.count();

		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		// return count;
		return c.apply(str);
	}

}
