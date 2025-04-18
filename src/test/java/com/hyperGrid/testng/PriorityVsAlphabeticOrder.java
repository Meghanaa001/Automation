package com.hyperGrid.testng;

import org.testng.annotations.Test;

public class PriorityVsAlphabeticOrder {

    @Test(priority = 1)
    public void loginAsAdmin(){

    }

    @Test
    public void aLoginAsGuest(){

    }
}
