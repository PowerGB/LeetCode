package com.test;

import java.util.StringTokenizer;

/**
 * Created by Bin Guo on 2/1/17.
 */
public class tokenizerDash {
    public static void main(String[] args) {
        StringTokenizer stn;
        String str = "__abc__d_e_fh";
        stn = new StringTokenizer(str, "_");
        while (stn.hasMoreTokens())
            System.out.println(stn.nextToken());
    }
}
