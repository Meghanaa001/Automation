package com.hyperGrid.javaBrushUp;

public class PolymorphismTest extends HGBase{


    @Override
    public String getMessage(){
        String s = "HyperGrid Technologies";
        System.out.println("s value :: " + s);
        return s;
    }

    public void sum(){

    }

    public void sum(int a, int b){

    }

    public void sum(int a, int b, int c){

    }

    public int sum(double a, int b){
        return 5;
    }

    public double sum(double a, int b, int c){
        return 5;
    }

    public void sum(int a, double b){

    }

    public void register(String email, String password, String confirmPassword){

    }

    public void register(String email, String password, String confirmPassword, int phone){

    }

    public void register(String email, String password, String confirmPassword, int phone, String street){

    }
}
