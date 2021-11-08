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
        Map<String, Integer> dupLetters = new HashMap<>();

        input = input.toLowerCase();
        String[] arrg = input.split("");
        for(String let : arrg){
            if(!dupLetters.containsKey(let)){
                dupLetters.put(let, 1);
            } else{
                int count = dupLetters.get(let);
                count++;
                dupLetters.put(let, count);
            }
        }
        Integer response = (dupLetters.containsKey(letter)) ? dupLetters.get(letter) : 0;
        return response;
    }
}
