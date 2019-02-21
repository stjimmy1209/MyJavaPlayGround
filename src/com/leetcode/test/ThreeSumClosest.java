package com.leetcode.test;

import java.util.*;

 class Tuple{

    int num1;
    int num2;
    int num3;
    int target;
    int diff;

    public Tuple(int num1, int num2, int num3, int target) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.target = target;
        this.diff = Math.abs((num1 + num2 + num3) - target);
    }

}

public class ThreeSumClosest {

    public static void main(String[] args) {

        int[]test = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(test, target));

    }



     private static int threeSumClosest(int[] nums, int target) {

        List<Integer> sums = new LinkedList<>();
        PriorityQueue<Tuple> myQueue = new PriorityQueue<>(1, new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                return o1.diff - o2.diff;
            }
        });
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    myQueue.offer(new Tuple(nums[i], nums[j], nums[k], target));
                }
            }
        }

        Tuple result = myQueue.poll();
        return result.num1 + result.num2 + result.num3;


    }

}
