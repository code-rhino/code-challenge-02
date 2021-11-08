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
        Integer count = 0;
        Map<String, Integer> dupCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            if(input.equalsIgnoreCase(letter)){
                dupCount.get(letter);
                count++;

                dupCount.put(letter,count);
            }
            else{
                dupCount.put(letter,1);
            }
        }
        return count;
    }
}
