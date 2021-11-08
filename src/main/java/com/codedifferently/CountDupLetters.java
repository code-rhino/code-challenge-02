package com.codedifferently;

import java.util.HashMap;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter)
    {
        HashMap<String, String> dupLetter = new HashMap<>();
        for (int i = 0; i <=input.length(); i ++) {
            if (dupLetter.containsKey(letter)) {
               String count = dupLetter.get(letter);
               count++;

            }
        }
        return dupLetter;
    }
}

