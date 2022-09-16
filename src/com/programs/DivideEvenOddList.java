package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideEvenOddList {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        
        List<List<Integer>> lists = intList.stream()
        .collect(Collectors.groupingBy(key->key%2==0,Collectors.toList()))
        .entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        
        
        List<List<Integer>> evenOddList = intList.stream()
        		.collect(Collectors.partitioningBy(integerValue->integerValue%2==0))
        		.entrySet().stream().map(mapValue->mapValue.getValue()).collect(Collectors.toList());
        
        System.out.println(evenOddList);
	}

}
