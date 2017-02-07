package com.leetcode.easy;

/**
 * Created by Bin Guo on 12/5/16.
 */

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class E1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new int[2];
        result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> pair = new HashMap<>();
        /**
         * HashMap<number,index>
         * loop, check "number", store "target-number"
         */
        for (int i = 0; i < nums.length; i++) {
            if (pair.containsKey(nums[i])) {
                result[0] = pair.get(nums[i]);
                result[1] = i;
                return result;
            } else
            /**
             * store number with the index of target - number
             */
                pair.put(target - nums[i], i);
        }
        return result;
    }
}
