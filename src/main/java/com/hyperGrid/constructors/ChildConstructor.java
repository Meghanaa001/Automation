package com.hyperGrid.constructors;

public class ChildConstructor extends ParentConstructor{

    public ChildConstructor(){
        super("Selenium");
        System.out.println("Child Default Constructor");
    }

/*
    public ChildConstructor(String name){
        System.out.println("Child Automation tool :: " + name);
    }
*/



    public static void main(String[] args) {
        ChildConstructor cc = new ChildConstructor();
        //ParentConstructor pc = new ParentConstructor("Appium");
    }
}
