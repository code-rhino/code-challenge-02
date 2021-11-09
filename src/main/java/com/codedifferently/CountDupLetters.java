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
            Map<String, Integer> dupLetters = new HashMap<>();

            String[] inputArray = input.toLowerCase().split("");

            for(String let : inputArray){
                if(dupLetters.containsKey(let)){
                    Integer count = dupLetters.get(let);
                    count++;

                    dupLetters.put(let, count);
                }else{
                    dupLetters.put(let, 1);
                }
            }

            return dupLetters.get(letter);
        }
    }

