package com.psrp.coding;

import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {

	public static void main(String[] args) {

		int[] array = { 15, 10, 16, 20, 8, 9, 7, 50 };

		//findNextGreatestElement(array);//time complexO(n^2)
		findNextGreatestElementUsingStack(array); //time complexO(n)
	}

	private static void findNextGreatestElementUsingStack(int[] a) {

		Stack<Integer> stk = new Stack<Integer>();
		int nextGrInt[] = new int[a.length];

// iterate over the remaining elements
		for (int j = a.length - 1; j >= 0; j--)
		{
			if (!stk.empty())
			{
				//15, 10, 16, 20, 8, 9, 7, 50
				while (!stk.empty() && stk.peek() <= a[j])
				{
					stk.pop();
				}
			}
			nextGrInt[j] = stk.empty() ? -1 : stk.peek();
			stk.push(a[j]);
		}
		for (int j = 0; j < a.length; j++)

			if(nextGrInt[j] != -1)
			{
				System.out.println( a[j] + "  -  " + nextGrInt[j]);
			}
			else
			{
				System.out.println( a[j] + "  - " +1);
			}
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
