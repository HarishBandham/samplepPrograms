package com.streamConversions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupBy {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		// Group By, Count and Sort

		Map<String, Long> count = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);

		System.out.println("\n----------------------------\n");
		// sort map by value
		Map<String, Long> sortedList = new LinkedHashMap<>();
		count.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(x -> sortedList.put(x.getKey(), x.getValue()));
		;

		System.out.println(sortedList);
		System.out.println("\n----------summing------------------\n");

		List<Item> fruitsItems = Arrays.asList(
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), 
				new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), 
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 40, new BigDecimal("9.99")));

		Map<String, Integer> fruitsPrice = fruitsItems.stream()
					.collect(Collectors.groupingBy(
							Item::getName,
							Collectors.summingInt(Item::getQty)
							));
		
		System.out.println(fruitsPrice);
	}

}
