package com.random.tests;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("James", 20);
        myMap.put("Ted", 25);
        myMap.put("Mike", 30);
        myMap.put("Jack", 20);
        String test = "com.random.tests.Test";
        System.out.println(test.contains("es"));

        for (Map.Entry<String, Integer> entry: myMap.entrySet()
             ) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.print(key + " ");
            System.out.print(value + " ");
        }


    }

}
