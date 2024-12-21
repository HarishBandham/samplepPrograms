package com.pdp.essential;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> myList = new ArrayList<>();
        List<String> copyList = new ArrayList<>();

        UnaryOperator<String> func2 = s -> s.chars().sorted().mapToObj(c -> {
                                                                    char cr = (char) c;
                                                                    return new String(String.valueOf(cr));
                                                                }).collect(Collectors.joining());
        Map<String, List<String>> count =
                Arrays.stream(strs).map(func2).collect(Collectors.groupingBy(Function.identity()));

        count.forEach((k,v)->{
            myList.add(v);
        });
        return myList;
    }

}


