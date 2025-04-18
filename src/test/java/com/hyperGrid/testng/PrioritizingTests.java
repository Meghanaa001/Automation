package com.hyperGrid.testng;

import org.testng.annotations.Test;

public class PrioritizingTests {

    @Test(priority = 2)
    public void loginAsUser(){
        System.out.println("login");
    }

    @Test(priority = 1)
    public void registerUser(){
        System.out.println("register");
    }

    @Test(priority = 3)
    public void selectSeats(){
        System.out.println("selectSeats");
    }

    @Test(priority = 6)
    public void verifySuccessMessage(){
        System.out.println("verifySuccessMessage");
    }

    @Test(priority = 4)
    public void selectPaymentMethod(){
        System.out.println("selectPaymentMethod");
    }
    @Test(priority = 5)
    public void completePayment(){
        System.out.println("completePayment");
    }
}
