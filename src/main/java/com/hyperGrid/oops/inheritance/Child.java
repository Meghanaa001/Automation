package com.hyperGrid.oops.inheritance;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.login();
        child.register();
        System.out.println(child.a);
        System.out.println(child.s);
        child.selectSeats();
        child.payment();
    }
}
