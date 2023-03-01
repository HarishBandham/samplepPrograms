package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","four","five","six","one","two","three");
		
		Stream<String> streamObj = Stream.of("Harish","Naresh","Mahesh","Harish");
		
		List<String> listObj1 = streamObj.filter(x-> x.equalsIgnoreCase("Harish" ))
				.collect(Collectors.toList());
				
		
//		List<String> listObj2 = streamObj.filter(x-> x=="Mahesh" )
//				.collect(Collectors.toList());
		
		List<String> collectList1 = list.stream().filter(x->x=="one")
					.collect(Collectors.toList());
		List<String> collectList2 = list.stream()
				.filter(x->x=="two").collect(Collectors.toList());
		List<String> collectList3 = list.stream()
				.filter(x->x=="three").collect(Collectors.toList());
		
		System.out.println(collectList1);
		System.out.println(collectList2);
		System.out.println(collectList3);
		
		System.out.println(listObj1);
		//System.out.println(listObj2);
		
		//List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		
	}

}
