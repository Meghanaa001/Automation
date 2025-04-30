package com.hyperGrid.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableTest {

    public static void main(String[] args) {
        Map<String,Double> map = new Hashtable<>();
        map.put("Selenium", 4.31);
        map.put("Appium", 2.17);
        map.put("RestAssured", 7.3);
        map.put("RestSharp", 7.3);
        map.put("Selenium", 4.32);
        //map.put(null, 1.2);
       // map.put("WebDriverIO", null);

        System.out.println(map);

        Map<String,Double> map1 = new TreeMap<>();
        map1.put("Selenium", 4.31);
        map1.put("Appium", 2.17);
        map1.put("RestAssured", 7.3);
        map1.put("RestSharp", 7.3);
        map1.put("Selenium", 4.32);
        //map.put(null, 1.2);
        // map.put("WebDriverIO", null);

        System.out.println(map1);
    }
}
