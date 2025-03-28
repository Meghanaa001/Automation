package com.hyperGrid.constructors;

public class DefaultConstructor {

    public DefaultConstructor(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        DefaultConstructor constructorTest = new DefaultConstructor();
        System.out.println(constructorTest);

        constructorTest.login();
    }

    public void login(){
        System.out.println("Test");
    }
}
