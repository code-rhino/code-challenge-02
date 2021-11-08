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
        static void count_characters(String input str){
            HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
            char[] str_array = input_str.toCharArray();
            for (char c : str_array){
                if (my_map.containsKey(c)){
                    my_map.put(c, my_map.get(c) + 1);
                }else{
                    my_map.put(c, 1);
                }
            }
            for (Map.Entry entry : my_map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        return null;
    }
}
