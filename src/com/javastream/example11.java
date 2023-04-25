package com.javastream;

import java.util.HashMap;
import java.util.Map;

public class example11 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        //bad
        for (Map.Entry<String,Integer> entry :map.entrySet()){
            String key= entry.getKey();
            int value= entry.getValue();
            System.out.println("key: " +key + ", Value: " +value);
        }

        //good
        map.entrySet().stream().forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
