package com.psrp.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIndexOfElement {
    public static void main(String[] args) {
        int arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
        int givenElement = 110;
        System.out.println(FindGivenElementIndex(arr,givenElement));

    }

    private static int FindGivenElementIndex(int[] arr,int givenElement) {
        List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if(arrayList.contains(givenElement)){
            return arrayList.indexOf(111);
        }
        return -1;
    }
}
