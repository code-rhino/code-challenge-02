package com.codedifferently;

import java.util.HashMap;
import java.util.Map;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter) {
        HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
        String[] strArray = input.split("");
        Integer count = 0;
        for (String c : strArray) {
            if (charCountMap.containsKey(c) && c.equalsIgnoreCase(letter)) {
                count = charCountMap.get(c);
                count++;
                charCountMap.put(c, count);
            } else {
                charCountMap.put(c, 1);
            }


        }
        return count;
    }
}

