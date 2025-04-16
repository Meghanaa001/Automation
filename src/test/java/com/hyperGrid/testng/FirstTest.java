package com.hyperGrid.testng;

import org.testng.annotations.Test;

public class FirstTest {

    public void firstTest(){
        System.out.println("First Test");
    }

    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();
        firstTest.firstTest();
    }


    @Test
    public void simpleTest(){
        System.out.println("Simple Test");
    }

    @Test
    public void simpleTest2(){
        System.out.println("Simple Test2");
    }

}
