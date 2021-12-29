package com.company.leetcode.algo.day1;

public class First_Bad_Version_278 {

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }


    public static boolean isBadVersion(int version){
        if(version == 1|| version == 2|| version == 3){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(6));
    }

}

