package com.hyperGrid.oops.interfaceA;

public class InterfaceImplementation implements BusinessActions{
    @Override
    public void login() {
        System.out.println("Login");
    }

    @Override
    public void payment() {
        System.out.println("Payment");
    }

    @Override
    public void enterCreditDetails() {
        System.out.println("Enter Credentials");
    }
}
