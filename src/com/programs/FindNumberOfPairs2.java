package com.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberOfPairs2 {
	public static void showPairs(int[] arr ,int sum) {
	        Map<Integer,Integer> hm = new HashMap<>();
	        int count=0;
	    for(int a:arr) {
	    	int b= sum-a;
	    	if(hm.containsKey(b)) {
	    		count=count + hm.get(sum-a);
			}
	    	
			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}	
	    	
	    }
	    System.out.println(count);
	  }
	public static void main(String[] args) {
		int arr[] = new int[] { 1,  1,  1, 1};
		//int arr[] = new int[] {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		//int arr[] = new int[] { 1, 5, 7, -1};
		//int arr[] = new int[] {5, 2, 6, 8, 1, 9};
		int sum = 2;
		showPairs(arr, sum);
		//System.out.println("Count of pairs is " + getPairsCount(arr, sum));
	}

}
