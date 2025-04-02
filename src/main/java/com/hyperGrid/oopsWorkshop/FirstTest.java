package com.hyperGrid.oopsWorkshop;

public class FirstTest {

    static {
        System.out.println("Breaking new - new version of java 24 released ");
    }
    static int a = 10;

    public static String getName(){
        return "Java";
    }

    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();
        getName();
    }
}
