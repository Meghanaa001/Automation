package com.hyperGrid.implementSelenium;

public class DriverFactory implements Selenium{

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void type() {
        System.out.println("Type");
    }
}
