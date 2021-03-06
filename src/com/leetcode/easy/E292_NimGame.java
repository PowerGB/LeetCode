package com.leetcode.easy;

/**
 * Created by Bin Guo on 12/5/16.
 */

import java.util.Scanner;

/**
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table,
 * each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner.
 * You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game.
 * Write a function to determine whether you can win the game given the number of stones in the heap.
 * Example:
 * if there are 4 stones in the heap, then you will never win the game:
 * no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */
public class E292_NimGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(nimGame(n));
    }

    public static boolean nimGame(int n){
        return n%4!=0;

    }
}
