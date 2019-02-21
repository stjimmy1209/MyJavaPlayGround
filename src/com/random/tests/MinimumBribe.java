package com.random.tests;

import java.util.HashMap;

public class MinimumBribe {

    static void minimumBribes(int n, int[] q) {

        int l = q.length;
        HashMap<Integer, Integer> bribes = new HashMap<>();
        for (int i = 0; i < l; i++) {
            bribes.put(q[i], 0);
        }
        for (int i = l - 2; i > 0; i--) {

        }

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
