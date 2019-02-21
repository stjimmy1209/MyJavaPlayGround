package com.leetcode.test;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int index = 0;
        while(nums[index] < target && index < nums.length - 1){
            index++;
        }
        if (target > nums[index]) return index + 1;
        return index;
    }

}
