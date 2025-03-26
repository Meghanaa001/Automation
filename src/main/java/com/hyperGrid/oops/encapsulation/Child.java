package com.hyperGrid.oops.encapsulation;

public class Child {

    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.setId(5000);
        int i = parent.getId();
        System.out.println(i);

        parent.setName("Appium");
        String s = parent.getName();
        System.out.println(s);

    }
}
