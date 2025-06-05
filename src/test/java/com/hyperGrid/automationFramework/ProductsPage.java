package com.hyperGrid.automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    By productsHeading = By.cssSelector(".title");
    By numberOfProducts = By.cssSelector(".inventory_item_name");

    public String getProductsHeading(){
        return driver.findElement(productsHeading).getText();
    }

    public int getNumberOfProducts(){
        return driver.findElements(numberOfProducts).size();
    }
}
