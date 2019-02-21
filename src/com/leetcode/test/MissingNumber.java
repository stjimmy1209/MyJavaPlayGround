package com.leetcode.test;

public class MissingNumber {



    public static int missingNumber(int[] nums) {

        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;

    }

}
