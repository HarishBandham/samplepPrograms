package com.psrp.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AlphaNumericValues {

	public static void main(String[] args) {

		List <String> ls =  Arrays.asList("as", "123", "32", "2as");
		
		System.out.println(FindNumericValuesInJava8(ls));
		System.out.println(FindNumericValuesInLegacy(ls));
	}

	private static List<Integer> FindNumericValuesInLegacy(List<String> ls) {
		List<Integer> result = new ArrayList<>();
		//Pattern pattern = Pattern.compile(".*[^0-9].*");
		for(String s:ls) {
			boolean isNumeric = true;
			for(int i=0;i<s.length();i++) {
				if(Character.isAlphabetic(s.charAt(i))) {
					isNumeric = false;
				}
			}
			if(isNumeric) {
				result.add(Integer.parseInt(s));
			}
		}
		return result;
	}

	private static List<Integer> FindNumericValuesInJava8(List<String> ls) {
		Predicate<String> isNumeric = str->str.matches("^[0-9]+$");
		
		return ls.stream().filter(isNumeric)
				.map(Integer::valueOf)
				.collect(Collectors.toList());
	}

}
