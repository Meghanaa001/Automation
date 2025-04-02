package com.hyperGrid.oopsWorkshop;

public class ImplementTest extends TestAbstract implements TestInterface, TestInterface1{

    @Override
    public void payment() {
        System.out.println("Payment");
    }

    @Override
    public void login() {
        System.out.println("Login");
    }

    @Override
    public void search() {
        System.out.println("Search");
    }
}
