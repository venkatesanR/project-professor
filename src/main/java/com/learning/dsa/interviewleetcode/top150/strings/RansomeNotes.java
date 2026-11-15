package com.learning.dsa.interviewleetcode.top150.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomeNotes {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || magazine.isEmpty() || ransomNote.isEmpty()) return false;

        Map<Character, Long> ransome_chars = ransomNote.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Character, Long> magazine_chars = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        for (Map.Entry<Character, Long> entry : ransome_chars.entrySet()) {
            if (!magazine_chars.containsKey(entry.getKey())
                    || entry.getValue() > magazine_chars.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

}
