package com.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String str = "Programming";
		
		Map<Character,Integer> result = new HashMap<>();
		for (int w = 0; w < str.length(); w++) {
			char key = str.charAt(w);
			if(result.containsKey(key)) {
				result.put(key, result.get(key)+1);
			}else {
				result.put(key, 1);
			}
		}
		System.out.println(result);
	}

}
