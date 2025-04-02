package com.hyperGrid.oopsWorkshop;

public class Parent {

    public Parent(){
        System.out.println("Parent Constructor");
    }

    private int id;
    int a = 10;

    public Parent setValue(int id){
        this.id = id;
        return this;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void sum(){
        System.out.println("Sum");
    }

    public void login(String username, String password){
        System.out.println(username + " :: " + password);
    }
}
