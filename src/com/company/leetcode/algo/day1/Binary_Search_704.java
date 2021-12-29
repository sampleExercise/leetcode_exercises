package com.company.leetcode.algo.day1;

public class Binary_Search_704 {

    public static int search(int[] nums, int target) {
        return searchBinaryRecursive(nums, target, 0, nums.length-1);
    }
    public static int searchBinaryRecursive(int[] nums, int target, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = (left + right)/2;
        if (target == nums[mid] ){
            return mid;
        }else if (target > nums[mid]){
            return searchBinaryRecursive(nums, target, mid+1, right);
        }else if (target < nums[mid]){
            return searchBinaryRecursive(nums, target, left, mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));

        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 2;
        System.out.println(search(nums1, target1));

    }

}

