package com.company.leetcode.algo.day1;

public class Search_Insert_Position_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

        int[] nums1 = { 1,3,5,6};
        int target1 = 2;
        System.out.println(searchInsert(nums1, target1));

        int[] nums2 = { 1,3,5,6};
        int target2 = 7;
        System.out.println(searchInsert(nums2, target2));
    }
}
