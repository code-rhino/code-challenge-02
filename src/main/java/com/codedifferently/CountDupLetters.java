package com.codedifferently;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */

    public Integer countDuplicateLetters(String input, String letter){
        HashMap<String,Integer> letterOccurence = new HashMap<>();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            char compared = input.toLowerCase().charAt(i);
            char letter1 = letter.charAt(0);
            if(compared == letter1){
                count +=1;
                letterOccurence.put(letter,count);
            }
        }
     return (Integer) letterOccurence.values().toArray()[0];

    }

    }

