package com.psrp.coding;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestWordInSentence {
    public static void main(String[] args) {

        String strValue = "I am interested to grow interested in my interested organization organization";
        findLongestWordInSentence(strValue);
    }
    private static void findLongestWordInSentence(String strValue) {

        // Stream.of(strValue.split(" ")).forEach(System.out::println);
        String LongestWord = Stream.of(strValue.split(" "))
                            .max(Comparator.comparing(x->x.length()))
                                    .get();
                            //.map(v->v).get();
                            //or
        
        Map<String,Long> occurence = Stream.of(strValue.split(" "))
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurence);
        
        Map<Integer,Set<String>> result = 
        		Stream.of(strValue.split(" "))
        		.collect(Collectors.groupingBy(String::length,
        					Collectors.mapping(
        							Function.identity(), 
        							Collectors.toSet())
        							));

        //System.out.println(LongestWord);
        //System.out.println(result);
    }
}
