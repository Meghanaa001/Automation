package com.hyperGrid.javaBasics;

public class MethodsAndReturnTypes {

    public void login(){
        System.out.println("Enter - UserName and Password");
    }

    public boolean isProductsDisplayed(){
        System.out.println("Welcome to products page :: ");
        return true;
    }

    public double getProductPrice(){
        System.out.println("Product price is $");
        return 29.99;
    }

    public String getProductTitle(){
        System.out.println("Product title is :: ");
        return "Sauce Labs Backpack";
    }

    public static void main(String[] args) {
        MethodsAndReturnTypes methodsAndReturnTypes = new MethodsAndReturnTypes();
        methodsAndReturnTypes.login();

        boolean productDisplayed = methodsAndReturnTypes.isProductsDisplayed();
        System.out.println(productDisplayed);

        String productName = methodsAndReturnTypes.getProductTitle();
        System.out.println(productName);

        double productPrice = methodsAndReturnTypes.getProductPrice();
        System.out.println(productPrice);
    }
}
