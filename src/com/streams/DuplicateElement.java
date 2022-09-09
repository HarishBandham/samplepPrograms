package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>(
				Arrays.asList(76, 3, 45, 56, 76, 9, 76, 45,0, 3 ));

		//By using map find all elemets repeated count
		Map<Integer, Long> mapResult = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		mapResult.forEach((k,v)->System.out.println(k+" - "+v));
		
		System.out.println("-------------set---------------\n");
		//print only duplicate elements 
		//76, 3, 45, 56, 76, 9, 76, 45,0, 3
		Set<Integer> duplicate = new HashSet<>();
		Set<Integer> duplicate1 =  
		list.stream().filter(x->!duplicate.add(x)).collect(Collectors.toSet());
		System.out.println(duplicate1);
		System.out.println("\n-----------map--entrySet---------------\n");
		
		//print only duplicate map elements
		
		List<Integer> duplicateKeys=
		mapResult.entrySet()
		.stream()
		.filter(obj->obj.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		//Or
		//.collect(Collectors.toCollection(ArrayList::new ));
		
		System.out.println(duplicateKeys);
		
		//print only duplicate elements by Collections.frequency(list,element)
		System.out.println("\n-------------frequency---------------\n");
		Set<Integer> freList = list.stream()
					.filter(i->Collections.frequency(list, i)>1)
					.collect(Collectors.toSet());
		System.out.println(freList);
	}

}
