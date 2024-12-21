package com.pdp.essential;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstUniqueCharacterIndex {

    public static void main(String[] args) {

        String s = "aabb";

        int result = firstuniqueCharacterIndex(s);

        System.out.println(result);

    }

    private static int firstuniqueCharacterIndex(String s) {

        List<Character> characterList = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        Optional<Integer> opt = characterList.stream().filter(x -> Collections.frequency(characterList, x) == 1)
                .map(x -> characterList.indexOf(x)).findFirst();

        if (opt.isPresent()) {
            return opt.get();
        }
        return -1;
    }

}

