package com.programs;

import java.util.HashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		
		int[] arr= new int[] {1,2,4,3};
		
		System.out.println(solution(arr));
	}
	
	
	static boolean solution(int[] A) {
		
		Set<Integer> unique = new HashSet<>();
		long count = 0;
		if (A.length % 2 == 0) {
			// {2,7,4,6,3,1},{-1,1};
			for (int i = 0; i < A.length; i++) {
				if (!unique.contains(A[i])) {
					for (int j = i + 1; j < A.length; j++) {

						if ((A[i] + A[j]) % 2 == 1 && !unique.contains(A[j])) {

							unique.add(A[i]);
							unique.add(A[j]);
							count++;
						}
					}
				}
			}
			
		}
		if(count == A.length/2) {
			return true;
		}
		
		return false;
	}
}
