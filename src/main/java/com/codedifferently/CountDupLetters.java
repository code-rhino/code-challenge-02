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
    public Integer countDuplicateLetters(String input, String letter){
            Map<Character, Integer> dupLetters = new HashMap<>();
            Character oneLetter;
            int count = 1;
            for(int i = 0; i< input.length(); i++){
                oneLetter = input.charAt(i);
                dupLetters.put(oneLetter,count);
            }
            System.out.println(dupLetters);
            return count;
        }
    }

