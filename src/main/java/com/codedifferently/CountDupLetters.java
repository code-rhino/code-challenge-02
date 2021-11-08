package com.codedifferently;

import java.util.HashMap;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        // provide a strong and provide a letter
        Integer count = 1;

        String letter1 = input.toLowerCase();

        char[] letters = letter1.toCharArray();

        HashMap<Character, Integer> duplicateLetter = new HashMap<>();
        // iterate through the string
        for (char word: letters){

            if (duplicateLetter.containsKey(word)) {
                // look for how many times you see the given letter
                count = duplicateLetter.get(word);
                // count the times
                count += 1;
                duplicateLetter.put(word, count);

            } else {
                duplicateLetter.put(word, count);
            }

        }

        return count;
    }
}
