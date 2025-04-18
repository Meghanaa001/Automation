package com.hyperGrid.testng;

import org.testng.annotations.Test;

public class OrderingTests {

    @Test
    public void bookTicketAsGuest(){
        System.out.println("bookTicketAsGuest");
    }

    @Test
    public void verifyTicketReceivedToMobile(){
        System.out.println("verifyTicketReceivedToMobile");
    }

    @Test
    public void verifyTicketReceivedToEmail(){
        System.out.println("verifyTicketReceivedToEmail");
    }

    @Test(dependsOnMethods = "registerUser")
    public void loginAsUser(){
        System.out.println("login");
    }

    @Test
    public void registerUser(){
        System.out.println("register");
    }

    @Test(dependsOnMethods = "loginAsUser")
    public void selectSeats(){
        System.out.println("selectSeats");
    }

    @Test(dependsOnMethods = "completePayment")
    public void verifySuccessMessage(){
        System.out.println("verifySuccessMessage");
    }

    @Test(dependsOnMethods = "selectSeats")
    public void selectPaymentMethod(){
        System.out.println("selectPaymentMethod");
    }
    @Test(dependsOnMethods = "selectPaymentMethod")
    public void completePayment(){
        System.out.println("completePayment");
    }
}
