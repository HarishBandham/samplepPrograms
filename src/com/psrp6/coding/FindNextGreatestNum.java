package com.psrp6.coding;

public class FindNextGreatestNum {

	public static void main(String[] args) {
		
		int[] arr = new int[]{15,10, 16, 20, 8, 9, 7, 50};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					max = arr[j];
					break;
				}
			}
			if(i!=arr.length-1)
				System.out.println(arr[i]+"-"+max);
			else
				System.out.println(arr[i]+"-1");
		}
			
		}
	}


