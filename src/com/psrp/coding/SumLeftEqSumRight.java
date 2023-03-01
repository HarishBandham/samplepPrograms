package com.psrp.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumLeftEqSumRight {

		// Finds an element in an array such that
		// left and right side sums are equal
		static int findElement(int arr[], int n)
		{
			List<Integer> list
				= Arrays.stream(arr).boxed().collect(
					Collectors.toList());
			for (int i = 1; i <= n; i++) {
				int leftSum = list.subList(0, i)
								.stream()
								.mapToInt(x -> x)
								.peek(System.out::println)
								.sum();
				System.out.println("------------");
				int rightSum = list.subList(i + 1, n)
								.stream()
								.mapToInt(x -> x)
								.peek(System.out::println)
								.sum();

				System.out.println("leftSum :"+leftSum +"  rightSum :"+rightSum);
				System.out.println("=============");
				if (leftSum == rightSum)
					return list.get(i);
			}
			return -1;
		}
		static String findElement1(int arr[], int size)
		{
		    int right_sum = 0, left_sum = 0;
		    right_sum = Arrays.stream(arr).sum();
		    for (int i = 0; i < size; i++) {
		        right_sum -= arr[i];
		        left_sum += arr[i];
		        if (left_sum == right_sum)
		            return "Array satisfies the condition at index: "+i;
		    }
		    return "Array doesn't satisfy the condition";
		}

		public static void main(String[] args)
		{
			// Case 1
			int arr1[] = { 1, 4, 2, 5 };
			int n1 = arr1.length;
			//System.out.println("output "+findElement(arr1, n1));

			// Case 2
			int arr2[] = { 2, 3, 4, 1, 4, 5 };
			int n2 = arr2.length;
			System.out.println(findElement(arr2, n2));
		}
	}

