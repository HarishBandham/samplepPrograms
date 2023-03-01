package com.programs;

import java.util.Arrays;

public class SortWithoutJAva8 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 ,6};

		int[] duplicate = new int[arr.length];

		int ZeroCount=arr.length-1;
		int initiallen = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
					if(arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						
					}
			}
			if(arr[i] != 0) {
				duplicate[initiallen] = arr[i];
				initiallen++;
			}else {
				duplicate[ZeroCount] = arr[i];
				ZeroCount--;
			}
			
		}
		System.out.println(Arrays.toString(duplicate));
		System.out.println(Arrays.toString(arr));
	}

}
