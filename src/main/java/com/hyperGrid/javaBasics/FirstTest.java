package com.hyperGrid.javaBasics;

import org.testng.annotations.Test;

public class FirstTest {

    int id = 10;
    String name = "Siva";

    /**
     * login function, enter username and password
     */
    public void login(){
        System.out.println("Enter - UserName and Password");
    }

    /**
     * loginWithAdmin
     */
    public void loginWithAdmin(){
        System.out.println("Enter - UserName and Password");
    }

    public static void register(){
        System.out.println("Enter all mandatory details");
    }

    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();
        FirstTest firstTest1 = new FirstTest();
        FirstTest firstTest2 = new FirstTest();
        new FirstTest(); // instance or object

        firstTest.login();
        int a = firstTest.id;
        System.out.println(firstTest.id);

        register();
    }

    @Test
    public void firstTestCase(){
        System.out.println("Test");
    }
}
