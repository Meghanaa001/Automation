package com.hyperGrid.javaBasics;

public class ParameterizingMethods {

    public static void main(String[] args) {
        ParameterizingMethods parameterizingMethods = new ParameterizingMethods();
        int a = parameterizingMethods.sum(483767647,56565);
        System.out.println(a);
        int b = sum(23478423,56456,6788);
        int c = sum(3364434,223342,6788);

        String s = parameterizingMethods.setName("Venkat");
        int d = parameterizingMethods.setId(251);


        String s1 = parameterizingMethods.setName("Siva");
        int d1 = parameterizingMethods.setId(252);
    }

    public String setName(String name){
        return name;
    }

    public int setId(int id){
        return id;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c, int d){
        return a+b+c;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
