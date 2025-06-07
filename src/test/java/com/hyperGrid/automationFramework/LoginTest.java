package com.hyperGrid.automationFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends HGBase{
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void initializePages(){
         loginPage = new LoginPage(driver);
         productsPage = new ProductsPage(driver);
    }

    @Test
    public void verifyLoginWithValidCredentials() {
        loginPage.login("standard_user","secret_sauce");
        String productsPageHeading = productsPage.getProductsHeading();
        int numberOfProducts = productsPage.getNumberOfProducts();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productsPageHeading, "Product", "Products page heading is not as expected");
        softAssert.assertTrue(numberOfProducts == 5, "Number of products is not as expected");
        softAssert.assertAll();
    }
}
