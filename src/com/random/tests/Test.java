package com.random.tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    static int countChair(int[] S, int[] E) {
        Arrays.sort(S);
        Arrays.sort(E);
        ArrayList<Integer> end = new ArrayList<>();
        for (int i = 0; i < E.length; i++) {
            end.add(E[i]);
        }
        int[]results = new int[S.length];
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            if(!end.contains(S[i])){
                count++;
                results[i] = count;
            }else{
                count++;
                for (int j = 0; j < end.size(); j++) {
                    if(S[i] == end.get(j)){
                        count--;
                        results[i] = count;
                    }
                }
            }
        }
        for (int i = 0; i < results.length - 1; i++) {
            count = Math.max(results[i], results[i + 1]);
        }
        return count;
    }
}
