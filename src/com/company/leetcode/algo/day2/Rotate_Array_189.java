package com.company.leetcode.algo.day2;

import java.util.Arrays;

public class Rotate_Array_189 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; //remainder
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {-1,-100,3,99};
        int k1 = 2;
        rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1));

    }
}
