package com.company.leetcode.algo.day4;


public class Reverse_words_in_a_string_III {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words)
            result.append(new StringBuffer(word).reverse().toString() + " ");
        return result.toString().trim();
    }


    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

        String s1 = "God Ding";
        System.out.println(reverseWords(s1));

    }

}

