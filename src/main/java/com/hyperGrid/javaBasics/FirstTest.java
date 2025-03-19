package com.hyperGrid.javaBasics;

public class FirstTest {

    int id = 10;
    String name = "Siva";

    public void login(){
        System.out.println("Enter - UserName and Password");
    }

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
}
