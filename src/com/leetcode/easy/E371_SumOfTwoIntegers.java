package com.leetcode.easy;

/**
 * Created by Bin Guo on 12/14/16.
 */

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class E371_SumOfTwoIntegers {
    public static void main(String[] args) {

    }

    public static int getSum(int a, int b) {
        if (b == 0)
            return a;
        int sum = 0;
        int carry = 0;

        sum = a ^ b;
        carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
