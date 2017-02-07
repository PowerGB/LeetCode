package com.leetcode.easy;

/**
 * Created by Bin Guo on 12/5/16.
 */

import java.util.Scanner;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class E344_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(reverseString(str));
    }


    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.charAt(i - 1));
        }
        return sb.toString();
    }
}
