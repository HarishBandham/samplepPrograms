package com.pdp.incubationProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

public class Module1StreamAPI {

	public static void main(String[] args) {

		
		List<Character> list1= Arrays.asList('a','b','c','d');
		List<Integer> list2= Arrays.asList(1,2,3,4);
		List<Integer> list3= Arrays.asList(10,20,30,40);
		
		
		perform(list1,list2,(l1,l2)->l1+""+l2);
		perform(list3,list2,(l1,l2)->l1-l2);
		perform(list1,list2,(l1,l2)->l1+"+"+l2);
		
			
	}

	private static <A1,A2,R> void perform(List<A1> list1, List<A2> list2,
									BiFunction<A1,A2,R> biFun) {
		
		List<R> result = new ArrayList<>();
		
		if(list1.size() ==  list2.size()) {
			for(int i=0;i<list1.size();i++) {
				result.add(biFun.apply(list1.get(i), list2.get(i)));
			}
		}
		
		result.forEach(System.out::println);
	}

}
