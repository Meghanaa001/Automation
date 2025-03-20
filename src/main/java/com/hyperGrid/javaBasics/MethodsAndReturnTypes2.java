package com.hyperGrid.javaBasics;

public class MethodsAndReturnTypes2 {

    public void sum(){
        int a = 4745745; // int a=10, b=10, c;
        int b = 456657;
        int c;
        c = a+b;
        System.out.println("a + b :: " + c);
        //return;
    }

    public int total(){
        int a=30, b=20, c;
        c = a+b;
        System.out.println("a + b :: " + c);
        return c;
    }

    public String getName(){
        return "Siva";
    }

    public int getId(){
        return 100;
    }

    public static void main(String[] args) {
        MethodsAndReturnTypes2 methodsAndReturnTypes2 = new MethodsAndReturnTypes2();
        methodsAndReturnTypes2.sum();
        int a = methodsAndReturnTypes2.total();
        System.out.println(a+a+a);

        System.out.println(methodsAndReturnTypes2.getName());
        System.out.println(methodsAndReturnTypes2.getId());
    }
}
