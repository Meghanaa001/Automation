package com.hyperGrid.javaBasics;

public class Child extends Parent{

    public static void main(String[] args) {
        Parent parent = (Parent) new Child();

        Child child = (Child) parent;

        parent.login();
        child.login();

    }


    public void login(){
        System.out.printf("Login method from Child class");
    }
}
