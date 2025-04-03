package com.hyperGrid.oops.abstractClass;

public class AbstractTest {

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest();
//        AbstractImplementation abstractImplementation = new AbstractTest();
        BusinessActions businessActions = new AbstractImplementation();

        businessActions.login();
        businessActions.payment();
        businessActions.enterCreditDetails();
    }
}
