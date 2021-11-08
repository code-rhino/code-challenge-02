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


         input = input.toLowerCase();
         String [] letterArray = input.split("");
         Map<String , Integer> duplicateCount = new HashMap<>();
         for(String letter: letterArray){
             System.out.println(letter);
             if(duplicateCount.containsKey(letter)){
                 Integer count = letterArray.get(letter);

                 duplicateCount.put(letter, count);
             }else{
                 duplicateCount.put(letter,1);
             }
         }


        }

    }


