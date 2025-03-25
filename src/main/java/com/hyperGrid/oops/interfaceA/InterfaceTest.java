package com.hyperGrid.oops.interfaceA;

public class InterfaceTest extends InterfaceImplementation {

    public static void main(String[] args) {
        BusinessActions bussinessActions = new InterfaceTest();
        bussinessActions.login();
        bussinessActions.payment();
        bussinessActions.enterCreditDetails();
    }

}
