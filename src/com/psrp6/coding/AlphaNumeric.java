package com.psrp6.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlphaNumeric {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>(Arrays.asList("as", "123", "32", "2as"));

		List<String> result = ls.stream()
				// .peek(x->System.out.println(x.matches("^[0-9]+$")))
				.filter(x -> x.matches("[0-9]+$")).collect(Collectors.toList());

		System.out.println(result);
	}

}
