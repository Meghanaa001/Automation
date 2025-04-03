package com.hyperGrid.oopsWorkshop;

public class Rectangle implements Shape{

    @Override
    public int calculateArea() {
        int l =10, w = 20;
        return l*w;
    }
}
