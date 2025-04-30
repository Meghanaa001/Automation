package com.hyperGrid.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class AboutMap {

    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("Selenium", 4.31);
        map.put("Appium", 2.17);
        map.put("RestAssured", 7.3);
        map.put("RestSharp", 7.3);
        map.put("Selenium", 4.32);
        map.put(null, 1.2);
        map.put("WebDriverIO", null);

        //keys - set
        //values - list

        System.out.println(map);
        System.out.println(map.get("Appium"));

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        Map.Entry<String, Double> map1; // one set : key, value pair
        map.entrySet(); // full entry

        for (Map.Entry<String, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " :: "+ entry.getValue());

        }
    }
}
