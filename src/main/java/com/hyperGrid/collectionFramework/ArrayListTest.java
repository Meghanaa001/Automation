package com.hyperGrid.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

       // List collection = new ArrayList();

        collection.add("Selenium");
        collection.add(4.31);
        collection.add(true);
        collection.add('S');
        collection.add(4);
        System.out.println(collection);

        System.out.println(collection);

        List list = new ArrayList();
        list.add("Selenium");
        list.add("Appium");
        list.add("RestAssured");
        list.add("Playwright");

        int[] a ={1,2,4,5,6,7};

        for (Object str: list){
            System.out.println(str);
        }

        List<String> list1 = new ArrayList<>();
        list1.add("Selenium");
        list1.add("Appium");
        list1.add("RestAssured");
        list1.add("Playwright");
        list1.add("Playwright");
        list1.add("Selenium");

        System.out.println(list1.indexOf("Automation"));

        for (String str: list1){
            System.out.print(str);
        }System.out.println();

        for (int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }System.out.println();


        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list1);

        System.out.println(list1.get(1).equals("Appium"));

        System.out.println("**********************");
        List<String> test = new ArrayList<>();
        System.out.println(test);



    }
}
