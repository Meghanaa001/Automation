package com.hyperGrid.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplementSeleniumWithTestNG {

    WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginAsUser(){
        WebElement usernameInputBox = driver.findElement(By.name("user-name"));
        usernameInputBox.clear();
        usernameInputBox.sendKeys("standard_user");

        WebElement passwordInputBox = driver.findElement(By.id("password"));
        passwordInputBox.clear();
        passwordInputBox.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }
}
