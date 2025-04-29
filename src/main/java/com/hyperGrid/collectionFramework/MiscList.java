package com.hyperGrid.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiscList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Selenium");
        list1.add("Appium");
        list1.add("RestAssured");
        list1.add("Playwright");
        list1.add("Playwright");
        list1.add("Selenium");
        System.out.println(list1);

        String[] automationTools = {"Selenium", "Postman", "TestNG", "Java"};
        System.out.println(automationTools);
        List<String> tools = Arrays.asList(automationTools);
        System.out.println(tools);

        List<String> autoTools = new ArrayList<>(Arrays.asList(automationTools));
        System.out.println(autoTools);

        //Collections.addAll(tools, automationTools);
        // tools.addAll(autoTools); mistake

        Collections.sort(tools);
        System.out.println(tools);




    }
}
