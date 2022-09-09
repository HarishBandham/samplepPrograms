package com.samplePrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmptyClass {

	public static void main(String[] args) {
		
		Map<String,Integer> mapelements = new HashMap<>();
		mapelements.put("haris", 22);
		mapelements.put("fdfs", 90);
		mapelements.put("naresh", 69);
		mapelements.put("suresh", 11);
		
		
		Map<String,Integer> sortedElem =  mapelements.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, 
											Map.Entry::getValue,
											(oldValue, newValue) -> oldValue,
											LinkedHashMap::new
										));
				
		
		System.out.println(sortedElem);
	}

}
