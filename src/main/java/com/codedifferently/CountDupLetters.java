package com.codedifferently;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        Map<String,Integer> letterCounter = new HashMap<>();


    String[] newArray = input.toLowerCase().split("");
    for( String a : newArray){
        if (letterCounter.containsKey(a)){
            Integer countIt = letterCounter.get(a);
            countIt++;

            letterCounter.put(a,countIt);



        }else {
            letterCounter.put(a,1);
        }


    }



        return letterCounter.get(letter);
    }
}
