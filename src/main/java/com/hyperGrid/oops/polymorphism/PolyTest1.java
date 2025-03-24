package com.hyperGrid.oops.polymorphism;

public class PolyTest1 {

    int  sum(int a){
        return 6;
    }

    int sum(){
        return 5;
    }

    public static void main(String[] args) {
        PolyTest1 polyTest1 = new PolyTest1();
        polyTest1.sum();

    }
}
