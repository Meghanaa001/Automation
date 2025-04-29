package com.hyperGrid.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Selenium");
        set.add("Appium");
        set.add("RestAssured");
        set.add("Playwright");
        set.add("Playwright");
        set.add("Selenium");
        set.add(null);
        set.add(null);
        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("Appium");
        list.add("RestAssured");
        list.add("Playwright");
        list.add("Playwright");
        list.add("Selenium");
        list.add(null);
        list.add(null);

        System.out.println( "index of ::  " + list.indexOf("Appium"));

        Set<String> hasSet = new HashSet<>(list);
        System.out.println(hasSet);

        List<String> arrayList = new ArrayList<>(set);
        System.out.println(arrayList);




    }
}
