package com.random.tests;

import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public int solution(int[] S, int[] E) {
        Arrays.sort(S);
        Arrays.sort(E);
        int result = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> endTime = new ArrayList<>();
        for (int i = 0; i < E.length; i++) {
            endTime.add(E[i]);
        }
        for (int i = 0; i < S.length; i++) {
            if(!endTime.contains(S[i])){
                result++;
                resultList.add(result);
            }else if(endTime.contains(S[i])){
                result++;
                resultList.add(result);
                for (int j = 0; j < endTime.size(); j++) {
                    if(endTime.get(j) == S[i]){
                        result--;
                        resultList.add(result);
                    }
                }
            }
            }

        for (int i = 0; i < resultList.size() - 1; i++) {
            result = Math.max(resultList.get(i), resultList.get(i + 1));
        }

        return result;
    }

}