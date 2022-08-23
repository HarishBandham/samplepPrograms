package com.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shuffle {

	public static void main(String[] args) {
		String str = "1110010101";
		//output ->1111100000
		
		//IntStream listInt = 
		Stream<Character> listInt = str.chars().mapToObj(x->(char)x)
				.sorted(Comparator.reverseOrder());
		String s1=listInt.map(Object::toString).collect(Collectors.joining());
		System.out.println(s1);				
		
		
		 String st="1010101";
	        
	        st=st.chars().mapToObj(c -> (char) c).
	        		sorted(Collections.reverseOrder())
	        		.collect(Collectors.toList())
	        		.stream().map(String::valueOf)
	        		.collect(Collectors.joining());
	        System.out.println(st);
	}

}
