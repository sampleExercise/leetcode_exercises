package com.company.leetcode.algo.day2;

import java.util.Arrays;

public class Squares_of_a_sorted_array_977 {
    public static int[] sortedSquares(int[] nums){
        int[] result = new int[nums.length];
        int i=0, j=nums.length-1;
        for(int index=j; index >=0; index--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[index] = nums[i] * nums[i];
                i++;
            }else{
                result[index] = nums[j] * nums[j];
                j--;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

        int[] nums1 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums1)));

    }

}

