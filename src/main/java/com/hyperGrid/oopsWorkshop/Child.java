package com.hyperGrid.oopsWorkshop;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.a = 20;
        child.sum();

        child.setId(50);
        int c = child.getId();
        System.out.println("C Value :: " + c);
    }

    @Override
    public void login(String username, String password){
        System.out.println("username :: " + username);
        System.out.println("password :: " + password);
    }

    public void total(int a, int b){
        System.out.println(a+b);
    }

    public void total(int a, double b){
        System.out.println(a+b);
    }

    public void total(double a, double b){
        System.out.println(a+b);
    }

    public void total(double a, int b){
        System.out.println(a+b);
    }

    public void total(double a, int b, int c){
        System.out.println(a+b+c);
    }
}
