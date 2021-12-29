package com.company.leetcode.algo.day3;

import java.util.Arrays;

public class Two_Sum_II_167 {
    public static int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
  /**
   * for nothing sorted
   *
   * public static int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        return quickSort(nums, 0, nums.length-1);
    }

    static int[] quickSort(int[] nums, int low, int high){
        if(low<high){
            int pivot = partition(nums, low, high);

            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
        return nums;
    }

    static int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(nums[j] <= pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);

        return i+1;
    }

    static int[] swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        return nums;
    }**/

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

        int[] nums1 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums1)));

    }

}

