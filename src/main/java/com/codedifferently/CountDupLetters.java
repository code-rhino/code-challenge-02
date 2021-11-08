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
        input = input.toLowerCase();
        String[] arrayOfLetters = input.split("");
        Map<String, Integer> letterCounter = new HashMap<>();
        for(String alphabet : arrayOfLetters) {
            System.out.println(letter);
            if (letterCounter.containsKey(alphabet)) {
                Integer count = letterCounter.get(alphabet);
                count += 1;
                letterCounter.put(letter, count);
            } else {
                letterCounter.put(letter, 1);
            }
        }
            return letterCounter.get(letter);
        }
    }

