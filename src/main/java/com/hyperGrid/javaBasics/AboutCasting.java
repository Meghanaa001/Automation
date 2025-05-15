package com.hyperGrid.javaBasics;

public class AboutCasting {

    public static class A{
        public void methodA(){
            System.out.println("Method A");
        }
    }

    public static class B extends A{
        public void methodB(){
            System.out.println("Method B");
        }
    }


    public static void main(String[] args) {
        A a = (A)new B();
        B b = (B)a;
    }
}
