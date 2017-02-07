package com.leetcode.easy;

/**
 * Created by Bin Guo on 12/7/16.
 */

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Example:
 * {1, 2, 3, 4, 5, 4, 3, 2, 5}
 * return 1
 * Rules:
 * 0 ^ N = N
 * N ^ N = 0
 */
public class E136_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
}
