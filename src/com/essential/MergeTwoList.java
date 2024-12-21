package com.pdp.essential;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,7,9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,6,8));

        List<Integer> list3 =
                Stream.of(list1,list2)
                        .flatMap(x->x.stream())
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(list3);

    }


}
