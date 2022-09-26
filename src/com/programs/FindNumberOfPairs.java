package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberOfPairs {
	
	static long count=0;
    static long getPairsCount(int arr[], int sum)
    {
        Map<Integer, Long> hm = Arrays.stream(arr).boxed()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        //System.out.println(hm);
        
        Arrays.stream(arr).boxed().forEach(x->{
        	if (hm.get(sum - x) != null) {
                count +=hm.get(sum - x);
        	}
            if (sum - x == x) {
                count--;
            }
        });      	
       
        return count/2;
    }
       // System.out.println("res : "+ count/2);
        /*
        int twice_count = 0;
 
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count +=hm.get(sum - arr[i]);
 
            if (sum - arr[i] == arr[i])
                twice_count--;
                
        }
       // System.out.println(twice_count);
        return twice_count / 2;
        */

	public static void main(String[] args) {
		//int arr[] = new int[] {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		//int arr[] = new int[] { 1,5,7,-1,5};
		//int arr[] = new int[] { 1, 1, 1, 1 };
		int arr[] = new int[] {5, 2, 6, 8, 1, 9};
		int sum = 16;
		System.out.println("Count of pairs is " + getPairsCount(arr, sum));
	}

}
