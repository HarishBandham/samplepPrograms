package com.psrp.coding;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWordInSentence {
    public static void main(String[] args) {

        String strValue = "I am interested to grow in my organization";
        findLongestWordInSentence(strValue);
    }
    private static void findLongestWordInSentence(String strValue) {

        // Stream.of(strValue.split(" ")).forEach(System.out::println);
        String LongestWord = Stream.of(strValue.split(" "))
                            .max(Comparator.comparing(x->x.length()))
                                    .get();
                            //.map(v->v).get();
                            //or


        System.out.println(LongestWord);
    }
}
