package com.hyperGrid.testng;

import org.testng.annotations.Test;

public class GroupsTests {


    @Test(groups = {"login"})
    public void simpleTest(){
        System.out.println("simpleTest");
    }

    @Test(groups = "smoke")
    public void loginAsUser(){
        System.out.println("login");
    }

    @Test(groups = "smoke")
    public void registerUser(){
        System.out.println("register");
    }

    @Test(groups = {"regression","smoke", "newFeature"})
    public void selectSeats(){
        System.out.println("selectSeats");
    }

    @Test(groups = "regression")
    public void verifySuccessMessage(){
        System.out.println("verifySuccessMessage");
    }

    @Test(groups = "regression")
    public void selectPaymentMethod(){
        System.out.println("selectPaymentMethod");
    }
    @Test(groups = "regression")
    public void completePayment(){
        System.out.println("completePayment");
    }
}
