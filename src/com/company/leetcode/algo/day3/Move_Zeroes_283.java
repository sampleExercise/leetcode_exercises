package com.company.leetcode.algo.day3;

import java.util.Arrays;

public class Move_Zeroes_283 {
    public static int[] twoSum(int[] numbers, int target) {
        // make use of sorted array
        int low = 0;
        int high = numbers.length - 1;
        while (low<high){
            int sum = numbers[low] + numbers[high];

            if(sum == target){
                return new int[]{low + 1, high + 1};
            }else if(sum < target){
                low++;
            }else{
                high--;
            }
        }

        return new int[]{-1, -1};
    }



    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums1 = {2, 3, 4};
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));


        int[] nums2 = {-1, 0};
        int target2 = -1;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

    }
}
