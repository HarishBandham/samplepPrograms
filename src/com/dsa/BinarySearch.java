package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7, 9, 10, 56};
        int targetNumber = 56;

        //int WhileLoopResult = binarySearchWithWhileLoop(numbers, targetNumber);
        int recursiveResult = recursiveBinarySearch(numbers, targetNumber, 0, numbers.length);

        System.out.println("Number found at index : " + recursiveResult);

        //time complexity is O( log n)
    }

    private static int binarySearchWithWhileLoop(int[] numbers, int targetNumber) {
        //3,4,5,6,7
        //tar = 6
        int left = 0;
        int right = numbers.length;

        while(left <= right) {

            int mid = (left + right) / 2;
            if( numbers[mid] == targetNumber) {
                return mid;
            } else if (numbers[mid] < targetNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] numbers, int targetNumber, int left, int right) {
        //3,4,5,6,7,9,10,56
        //tar = 56
        if( left <= right ) {
            int mid = (left + right) / 2;
            if (numbers[mid] == targetNumber) {
                return mid;
            } else if (numbers[mid] < targetNumber) {
                return recursiveBinarySearch(numbers, targetNumber, (mid + 1), right);
            } else {
                return recursiveBinarySearch(numbers, targetNumber, left, (mid - 1));
            }
        }
        return -1;
    }
}
