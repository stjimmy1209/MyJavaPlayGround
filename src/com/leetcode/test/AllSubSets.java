package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSets {


    public static void main(String[] args) {
        int[] test = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>(subsets(test));
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> selected, int [] nums, int start){

        if (start == nums.length) {
            list.add(new ArrayList<>(selected));
            return;
        }
        selected.add(nums[start]);
        backtrack(list, selected, nums, start + 1);
        selected.remove(selected.size() - 1);
        backtrack(list, selected, nums, start + 1);

    }
}
