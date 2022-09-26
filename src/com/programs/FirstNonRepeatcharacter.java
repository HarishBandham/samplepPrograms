package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNonRepeatcharacter {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		String s = str.replaceAll(" ","");
		
		//solution 1
		String res = Arrays.stream(str.split(""))
				.filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
        System.out.println(res);

      //solution 2
		List<String> charList = Stream.of(str.replaceAll(" ","")
				.split("")).collect(Collectors.toList());
		
		String sq = charList.stream().filter(c->Collections.frequency(charList,c )==1)
		.findFirst().get();

		System.out.println(sq);
		
		 //solution 3
		Set<Character> setlist = new HashSet<>();
		 Stream.of(str.replaceAll(" ","").chars().mapToObj(i -> (char)i)).
		 forEach(System.out::println);
		//.filter(x->setlist.add(x)).forEach(System.out::println);
}
}
