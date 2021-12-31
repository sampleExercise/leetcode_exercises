package com.company.leetcode.algo.day6;

import java.util.HashMap;
import java.util.Map;

public class Longest_substring_without_repeating_chars_3 {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0, retVal = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) >= start){
                    start = map.get(c) + 1;
                }
            }
            retVal = Math.max(retVal, i - start + 1);
            map.put(c, i);
        }
        return retVal;
    }

    public static void main(String[] args){
        String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
