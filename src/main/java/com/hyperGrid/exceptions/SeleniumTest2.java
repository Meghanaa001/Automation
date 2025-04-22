package com.hyperGrid.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest2 {

    public static WebDriver webDriver;

    // This is not a proper way of handling exceptions, we will have multiple
    public static void main(String[] args) throws NoSuchElementException {
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.saucedemo.com/");

        WebElement usernameInputBox = webDriver.findElement(By.name("user-nam"));
        usernameInputBox.clear();
        usernameInputBox.sendKeys("standard_user");

        WebElement passwordInputBox = webDriver.findElement(By.id("passwor"));
        passwordInputBox.clear();
        passwordInputBox.sendKeys("secret_sauce");


        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();
    }
}
