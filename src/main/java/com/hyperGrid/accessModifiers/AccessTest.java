package com.hyperGrid.accessModifiers;

public class AccessTest {

    public void sum(){
        System.out.println("Sum");
    }

    private void test(){
        System.out.println("Test");
    }

    protected void total(){
        System.out.println("Total");
    }

    void click(){
        System.out.println("Click");
    }

    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
        accessTest.test();
    }
}
