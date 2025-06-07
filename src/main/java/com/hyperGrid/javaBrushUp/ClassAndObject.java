package com.hyperGrid.javaBrushUp;

public class ClassAndObject{
    /*
    public ClassAndObject(){
        System.out.println("Constructor");
    }*/

    public void login(){
        System.out.println("Login");
    }

    public static void register(){
        System.out.println("Register");
    }

    public static void main(String[] args) {
        ClassAndObject classAndObject = new ClassAndObject();
        classAndObject.login();
        ClassAndObject.register();

        // Class Name , Object not required
        HGBase.payment();

        // Object is created
        HGBase hgBase = new HGBase();
        hgBase.bookTickets();
    }


}
