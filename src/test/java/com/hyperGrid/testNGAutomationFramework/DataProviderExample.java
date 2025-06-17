package com.hyperGrid.testNGAutomationFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderExample extends HGBase{

    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void initializePages(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @BeforeMethod
    public void reLaunchTheApp(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test(dataProvider = "userCredentials", dataProviderClass = ReadDataFromExcel.class)
    public void verifyLoginWithValidCredentials(String userType, String userName, String password) {
        loginPage.login(userName,password);
        String productsPageHeading = productsPage.getProductsHeading();
        int numberOfProducts = productsPage.getNumberOfProducts();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productsPageHeading, "Products", "Products page heading is not as expected");
        softAssert.assertTrue(numberOfProducts == 6, "Number of products is not as expected");
        softAssert.assertAll();
    }
}
