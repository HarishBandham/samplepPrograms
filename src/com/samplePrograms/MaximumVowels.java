package com.samplePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumVowels {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps right over the little lazy dog";
		//System.out.println(getMaxVowelsWords(s));
		secondApproch();
	}

	static Set<String> getMaxVowelsWords(String s) {
		Function<String, Long> c = t -> t.chars().filter(d -> d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')
				.count();
		Map<String, Long> map = Stream.of(s.split(" ")).collect(Collectors.toMap(t -> t, t -> c.apply(t)));
		Map.Entry<String, Long> highest = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		return map.entrySet().stream()
				.filter(t -> t.getValue().equals(highest.getValue()))
				.map(g -> g.getKey())
				.collect(Collectors.toSet());
	}
	
	static void secondApproch() {
	String input="The quick brown fox jumps right over the little lazy dog.";
    String[] words=input.split(" ");
    String regex="[^aeiouAEIOU]";
    int maxNoOfVowels=Arrays.stream(words)
            .map(w->w.replaceAll(regex, ""))
            .peek(x->System.out.println(x))
            .max(Comparator.comparing(String::length)).get().length();
    
    Arrays.stream(words)
    .filter(word->word.replaceAll(regex, "").length()
            == maxNoOfVowels)
    .forEach(System.out::println);
	}
}
