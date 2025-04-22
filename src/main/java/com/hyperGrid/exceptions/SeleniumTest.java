package com.hyperGrid.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    public static WebDriver webDriver;
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.saucedemo.com/");


        try{
            WebElement usernameInputBox = webDriver.findElement(By.name("user-nam"));
            usernameInputBox.clear();
            usernameInputBox.sendKeys("standard_user");
        } catch (NoSuchElementException nse){
            throw new NoSuchElementException("Element not found");
        }

        try {
            WebElement passwordInputBox = webDriver.findElement(By.id("passwor"));
            passwordInputBox.clear();
            passwordInputBox.sendKeys("secret_sauce");
        }catch (NoSuchElementException nse){
            throw new NoSuchElementException("Element not found");
        }


        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();
    }
}
