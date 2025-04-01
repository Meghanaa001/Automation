package com.hyperGrid.thisAndSuper;

public class Child extends Parent {
    int a = 10;
    String name = "Selenium";
    static int c = 30;

    public static void main(String[] args) {
        Child child = new Child();
        child.a = 30;
        child.setId();
        System.out.println(child.a);
    }

    public static void autoTest(){
        c = 50;
    }

    public void autoTest1(){
        c =51;
    }

    public void setId() {
        this.a = 20;
        super.b = 30;
        super.test1();
        super.d = 60;
    }

    public void test() {
        this.setId();
        super.test1();
    }
}
