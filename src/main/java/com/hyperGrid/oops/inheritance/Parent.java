package com.hyperGrid.oops.inheritance;

public class Parent extends Ancestor{

    int a =10;
    String s ="Selenium";
    public void login(){
        System.out.println("Login");
    }

    public void register(){
        System.out.println("Register");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.register();
        parent.login();
        parent.selectSeats();
        parent.payment();
    }
}
