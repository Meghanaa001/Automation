package com.hyperGrid.arrays;

public class ArraysTest1 {

    public static void main(String[] args) {
        String tools = "Selenium Playwright";
        String[] automationTools = {"Selenium", "Postman", "TestNG", "Java"};

        System.out.println(tools.length());
        System.out.println(automationTools.length);
        System.out.println(automationTools[0]);
        System.out.println(automationTools[3]);

        for (int i=0; i<automationTools.length; i++){
            System.out.println(automationTools[i]);
        }

        for(String toolName: automationTools){
            System.out.println(toolName);
        }

    }
}
