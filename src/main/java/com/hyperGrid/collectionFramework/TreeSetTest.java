package com.hyperGrid.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Selenium");
        set.add("Appium");
        set.add("RestAssured");
        set.add("Playwright");
        set.add("Playwright");
        set.add("Selenium");
        System.out.println(set);

        for (String s:set){
            System.out.println(s);
        }

        Iterator iterator = set.iterator();
//        System.out.println(iterator.next()); // actual value in the set
//        System.out.println(iterator.hasNext()); // boolean
        System.out.println("*************");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
