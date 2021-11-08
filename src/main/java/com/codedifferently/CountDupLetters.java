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
        Map<Character, Integer> letterCount = new HashMap<>();
        String lower = input.toLowerCase();
        Integer count = 0;



       for(int i =0; i<input.length(); i++){
           letterCount.put('letter',1);
           count++;
        }
        System.out.println();


        return null;
    }

    public static void main(String[] args) {
        CountDupLetters x = new CountDupLetters();



    }
}
