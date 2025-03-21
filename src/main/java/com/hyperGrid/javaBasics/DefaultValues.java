package com.hyperGrid.javaBasics;

public class DefaultValues {

    int a;
    boolean b;
    float f;
    double d;
    String s;
    char c;

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println(defaultValues.a);
        System.out.println(defaultValues.b);
        System.out.println(defaultValues.c);
        System.out.println(defaultValues.d);
        System.out.println(defaultValues.f);
        System.out.println(defaultValues.s);

        defaultValues.a = 20;
        System.out.println(defaultValues.a);
    }

    public void sampleTest(){
        int a = 0,b = 0;
        a = 10;
        b = 20;
        int c = a+b;
        System.out.println(c);
    }
}
