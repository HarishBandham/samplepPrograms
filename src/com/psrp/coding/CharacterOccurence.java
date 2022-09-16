package com.psrp.coding;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurence {
    public static void main(String[] args) {

        String strValue = "organization";
        
        System.out.println(findEachCharacterOccurence(strValue));
    }

    private static Map<Character,Long> findEachCharacterOccurence(String strValue) {

        return strValue.replaceAll(" ","").chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
