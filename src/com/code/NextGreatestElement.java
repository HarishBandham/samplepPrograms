package com.psrp.code;

import java.util.Stack;

public class NextGreatestElement {

	public static void main(String[] args) {

		int[] array = { 15, 10, 16, 20, 8, 9, 7, 50 };

		findNextGreatestElement(array);
		findNextGreatestElementUsingStack(array);
	}

	private static void findNextGreatestElementUsingStack(int[] array) {

	//	Stack<Integer>
	}

	private static void findNextGreatestElement(int[] array) {
		
		int arraySize = array.length;
		for (int i = 0; i < arraySize; i++) {

			if (i == arraySize - 1) {
				System.out.println(array[i] + "-" + 1);
				break;
			}
			else {
				for (int j = i + 1; j < arraySize; j++) {

					if (array[i] < array[j]) {
						System.out.println(array[i] + "-" + array[j]);
						break;
					}
				}
			}
		}
		 
	}
	
}
