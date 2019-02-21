package com.random.tests;

import java.util.*;

public class MyTest {

    public static void main(String[] args) {

        int[] test = {2,4,6,7,9,12,5,11};
        PriorityQueue<Integer> pq = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        while (pq.size() < 4){
            for (int i = 0; i < test.length; i++) {
                pq.add(test[i]);
            }
        }
    }

}
