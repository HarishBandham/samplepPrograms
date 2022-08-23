package com.stringJoins;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a","b","c");
		System.out.println("\n--------String.join-----------\n");
		String result = String.join("|" , list);
		System.out.println(result);
		//or
		System.out.println("\n--------Collectors.joining-----------\n");
		String result1 = list.stream().collect(Collectors.joining("-"));
		System.out.println(result1);
		
		System.out.println("\n--------Collectors.joining( , , )-----------\n");
		
		 String result2 = list.stream()
					.collect(Collectors.joining("* ", "{", "}"));
		 System.out.println(result2);
	}
}
