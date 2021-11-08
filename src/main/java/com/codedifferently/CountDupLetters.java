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

    //loop word
    public Integer countDuplicateLetters(String input, String letter){
        Map<Character, Integer> dupLetters = new HashMap<>();
        Character oneLetter;
        input= input.toLowerCase();
        int count = 1;
        for(int c = 0; c< input.length(); c++){
           oneLetter = input.charAt(c);
           dupLetters.put(oneLetter,count);
           if(dupLetters.containsKey(oneLetter)){
               count = dupLetters.get(oneLetter);
               count++;
           } //getting outrageous counts
        }
        System.out.println(dupLetters);
        return null;
    }
}
