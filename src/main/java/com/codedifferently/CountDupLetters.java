package com.codedifferently;

import java.util.HashMap;
import java.util.Map;

public class CountDupLetters {
    /**
     * @param input  the string to be searched
     * @param letter the letter that you will search for
     * @return
     */

    public Integer countDuplicateLetters(String input, String letter) {
        Map<Character, Integer> duplicateLetters = new HashMap<>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Character oneLetter;
        int count = 1;
        for(int c = 0; c< input.length(); c++) {
            oneLetter = input.charAt(c);
            duplicateLetters.put(oneLetter,count);
        }
        System.out.println(duplicateLetters);
        return count;
    }
}