package com.samplePrograms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 32, 52, 76, 81, 111, 135, 140, 170 };
		int searchKey = 111;
		System.out.println(binarySearch(arr, searchKey));

	}

	private static int binarySearch(int[] arr, int searchKey) {

		int low = 0;
		int high = arr.length;
		
		while (low <= high) {
			
			int midIndex = (low + high) / 2;
			int midIndexNumber = arr[midIndex];
			
			if (searchKey == midIndexNumber) {
				return midIndex;
			}
			if (searchKey < midIndexNumber) {
				high = midIndex - 1;
			}
			if (searchKey > midIndexNumber) {
				low = midIndex + 1;
			}
		}
		return -1;

	}

}
