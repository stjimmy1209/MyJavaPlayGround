package com.random.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode {

    public static void main(String[] args) {
        System.out.println(myHashMap("rat").entrySet());
        System.out.println(myHashMap("car").entrySet());
        if(myHashMap("rat").entrySet().equals(myHashMap("car").entrySet())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    static HashMap<Character, Integer> myHashMap(String str){
        HashMap<Character,Integer> myMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(!myMap.containsKey(str.charAt(i))){
                myMap.put(str.charAt(i), 1);
            }else{
                myMap.replace(str.charAt(i), ++count);
            }
        }
        return myMap;
    }

    public boolean isAnagram(String s, String t) {
        return myHashMap(s).entrySet().equals(myHashMap(t).entrySet());

    }

}
