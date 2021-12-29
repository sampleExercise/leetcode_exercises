package com.company.leetcode.algo.day4;

import java.util.Arrays;

public class Reverse_String_344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length;
        int mid = start + (end - start)/2;

        for(int i=0; i<mid; i++){
            char tmp = s[i];
            s[i] = s[end-1-i];
            s[end-1-i] = tmp;
        }
    }


    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

        char[] s1 = {'H','a','n','n','a','h'};
        reverseString(s1);
        System.out.println(Arrays.toString(s1));

    }
}
