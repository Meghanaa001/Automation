package com.hyperGrid.javaBasics;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        Test1 test1 = new Test1();
        MethodsAndReturnTypes methodsAndReturnTypes = new MethodsAndReturnTypes();

        test1.register();
        test1.loginTest();
        methodsAndReturnTypes.getProductTitle();
        methodsAndReturnTypes.getProductPrice();
        methodsAndReturnTypes.isProductsDisplayed();
    }
}
