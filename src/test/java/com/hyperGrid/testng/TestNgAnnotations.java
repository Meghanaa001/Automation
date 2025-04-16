package com.hyperGrid.testng;

import org.testng.annotations.*;

public class TestNgAnnotations {

    @Test
    public void loginAsUser(){
        System.out.println("Login");
    }

    @Test
    public void registerUser(){
        System.out.println("Register");
    }

    /**
     * Before executions starts
     */
    @BeforeSuite
    public void initializeDrivers(){
        System.out.println("initializeDriver/launchBrowser");
    }

    /**
     * Will execute before all the classes/ before
     */
    @BeforeTest
    public void launchApplication(){
        System.out.println("launchApplication");
    }

    /**
     * Before every specific class
     */
    @BeforeClass
    public void initializeClasses(){
        System.out.println("initializeClasses");
    }

    /**
     * before every test case/ test method
     */
    @BeforeMethod
    public void forEveryTestCase(){
        System.out.println("Before EveryTestCase");
    }

    @AfterSuite
    public void killSession(){
        System.out.println("Kill Session");
    }

    @AfterTest
    public void killDriver(){
        System.out.println("Kill Driver");
    }

    @AfterClass
    public void afterEveryClass(){
        System.out.println("After every class");
    }

    @AfterMethod
    public void afterEveryTest(){
        System.out.println("After every TestCase");
    }
}
