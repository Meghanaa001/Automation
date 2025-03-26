package com.hyperGrid.oops.abstractionExample;

public class Rectangle extends Shape{
    @Override
    public void calculateArea() {
        int l=10, w = 5;
        int area = l*w;
        System.out.println(area);
    }
}
