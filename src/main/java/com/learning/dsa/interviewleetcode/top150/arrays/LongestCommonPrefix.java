package com.learning.dsa.interviewleetcode.top150.arrays;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] data = new String[]{"fig", "fin", "find"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(data));
    }

    public String longestCommonPrefix(String[] strs) {
        String EMPTY = "";

        if (strs == null || strs.length == 0) return EMPTY;

        String sampleString = strs[0];

        for (String data : strs) {
            while (!data.startsWith(sampleString)) {
                sampleString = sampleString.substring(0, sampleString.length() - 1);
                if (sampleString.isEmpty()) {
                    return EMPTY;
                }
            }
        }
        return sampleString;
    }

    public String longestCommonPrefix2(String[] strs) {
        String EMPTY = "";

        if (strs == null || strs.length == 0) return EMPTY;

        String smallestString = Arrays.stream(strs).sorted().findFirst().orElse(EMPTY);

        if (smallestString.isEmpty()) {
            return EMPTY;
        }

        int length = 0;
        while (length <= smallestString.length()) {
            boolean match = true;
            for (String data : strs) {
                if (!data.substring(0, length).equals(smallestString.substring(0, length))) {
                    match = false;
                    break;
                }
            }
            if (!match) {
                break;
            }
            length += 1;
        }

        return smallestString.substring(0, length - 1);
    }
}
