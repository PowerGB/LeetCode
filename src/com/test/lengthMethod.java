package com.test;

/**
 * Created by Bin Guo on 1/31/17.
 */
public class lengthMethod {
    public static int[] ints = {1_900_000, 1_700_000, 1_800_000};
    public static String[] strs = {"a", "b", "c"};
    public static TEST[] tst = {new TEST(), new TEST()};
    public static void main(String[] args) {
        System.out.format("%,d\n", strs[0]);
        System.out.println(tst.length);
    }
}
class TEST{
    int i ;
}