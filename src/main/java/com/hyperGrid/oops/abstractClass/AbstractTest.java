package com.hyperGrid.oops.abstractClass;

public class AbstractTest extends AbstractImplementation{

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest();
        AbstractImplementation abstractImplementation = new AbstractTest();
        BusinessActions businessActions = new AbstractTest();

        businessActions.login();
        businessActions.payment();
        businessActions.enterCreditDetails();
    }
}
