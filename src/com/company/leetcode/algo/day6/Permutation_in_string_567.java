package com.company.leetcode.algo.day6;

public class Permutation_in_string_567 {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int[] arr_s1 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            arr_s1[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i<=s2.length() - s1.length(); i++){
            int[] arr_s2 = new int[26];
            for(int j = 0; j < s1.length(); j++){
                arr_s2[s2.charAt(i + j) - 'a']++;
            }
            if(matches(arr_s1, arr_s2)) return true;
        }
        return false;
    }

    public static boolean matches(int[] s1map, int[] s2map){
        for(int i = 0; i < 26; i++){
            if (s1map[i] != s2map[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";

        checkInclusion(s1, s2);
    }
}
