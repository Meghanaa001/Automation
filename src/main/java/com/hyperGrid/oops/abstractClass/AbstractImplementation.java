package com.hyperGrid.oops.abstractClass;

public class AbstractImplementation extends BusinessActions{
    @Override
    public void payment() {
        System.out.println("Payment");
    }

    @Override
    public void enterCreditDetails() {
        System.out.println("Credit Card details");
    }
}
