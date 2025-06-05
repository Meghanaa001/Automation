package com.hyperGrid.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WritingCustomActions {
    WebDriver webDriver;
    public void clickOnWebElement(By locator){
        webDriver.findElement(locator).click();
    }

    public void typeValue(By locator, String data){
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(data);
    }

    public String getTextWebElement(By by){
        String text = webDriver.findElement(by).getText();
        return text;
    }

    @AfterClass
    public void killSession(){
        webDriver.quit();
    }

    @BeforeClass
    public void initialize(){
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void login(){
        typeValue(By.id("user-name"), "standard_user");
        typeValue(By.id("password"), "secret_sauce");
        By loginButton = By.id("login-button");
        clickOnWebElement(loginButton);
        String productsPageHeading = getTextWebElement(By.cssSelector(".title"));
        Assert.assertEquals(productsPageHeading, "Products", "Both values are not same");
    }
}
