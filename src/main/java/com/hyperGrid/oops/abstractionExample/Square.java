package com.hyperGrid.oops.abstractionExample;

public class Square extends Shape{

    @Override
    public void calculateArea() {
        int l=10;
        int area = l*l;
        System.out.println(area);
    }
}
