package com.programs;

import java.util.Arrays;

public class SortWithoutJAva8 {	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0, 6 };
		//findDuplicate();
		int[] duplicate = new int[arr.length];

		int ZeroCount = arr.length - 1;
		int initiallen = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			//System.out.println(Arrays.toString(arr));
			if (arr[i] != 0) {
				duplicate[initiallen] = arr[i];
				initiallen++;
			} else {
				duplicate[ZeroCount] = arr[i];
				ZeroCount--;
			}
		}
		System.out.println(Arrays.toString(duplicate));
		 //System.out.println(Arrays.toString(arr));
	}

	static void findDuplicate() {
		int arr[] = { 1, 2, 4, 0, 4, 2, 3, 0, 5, 0, 6, 6 };

		String str = ",";
		String duplicateStr="";
		for (int i = 0; i < arr.length; i++) {
			String strEle = "," + String.valueOf(arr[i]) + ",";
			if (str.contains(strEle)) {
				System.out.println(arr[i]);
			} else {
				str += arr[i] + ",";
			}
		}

	}
}
