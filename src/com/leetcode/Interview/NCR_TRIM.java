package com.leetcode.Interview;

/**
 * Created by Bin Guo on 2/1/17.
 */
public class NCR_TRIM {
    public static void main(String[] args){
        String str = "___abc__d_e_fh___";
        int flag_1 = -1;
        int flag_2 = -1;
        for(int i = 0 ; i < str.length(); i++){
//            System.out.println(str.charAt(i));
            if (str.charAt(i)!='_'&& flag_1 == -1)
                flag_1 = i;
            if (str.charAt(i)!='_')
                flag_2 = i;
        }
        System.out.println(str.substring(flag_1,flag_2+1));
    }
}
