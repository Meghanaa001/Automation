package com.hyperGrid.constructors;

public class MultipleConstructors {

    public MultipleConstructors(){
        System.out.println("Default Constructor");
    }

    public MultipleConstructors(int id){
        System.out.println("Emp Id :: " + id);
    }

    public MultipleConstructors(int id1, int id2, int id3){
        System.out.println("Emp Id :: " + id1);
    }

    public MultipleConstructors(String name){
        System.out.println("Emp name :: " + name);
    }

    public MultipleConstructors(int a, int b){

    }

    public MultipleConstructors(double a, int b){

    }


    public static void main(String[] args) {
        MultipleConstructors mc = new MultipleConstructors();
        MultipleConstructors mc1 = new MultipleConstructors(500);
        MultipleConstructors mc2 = new MultipleConstructors("Appium");
    }
}
