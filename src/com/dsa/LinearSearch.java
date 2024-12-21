package com.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7,9,10,56};
        int targetNumber = 56;


        int result = linerSearch(numbers, targetNumber);
        System.out.println("Number found at index : " +result);

        //time complexity is O(n)
    }

    private static int linerSearch(int[] numbers, int targetNumber) {
        for (int i= 0; i<numbers.length; i++){
            if(numbers[i] == targetNumber)
                return i;
        }
        return -1;
    }
}
