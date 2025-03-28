package com.hyperGrid.constructors;

public class ParametrizedConstructor {

    public ParametrizedConstructor(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ParametrizedConstructor pc = new ParametrizedConstructor(5,5);
        ParametrizedConstructor pc1 = new ParametrizedConstructor(10, 10);
        ParametrizedConstructor pc2 = new ParametrizedConstructor(100, 400);

        int b = pc.sum(5, 5);
        int c = pc1.sum(50, 50);
        int d = pc2.sum(100,100);
    }


    public int sum(int a, int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }
}
