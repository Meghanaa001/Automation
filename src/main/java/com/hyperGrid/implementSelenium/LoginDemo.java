package com.hyperGrid.implementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginDemo {
    static WebDriver webDriver;

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.saucedemo.com/");


        WebElement usernameInputBox = webDriver.findElement(By.name("user-nam"));
        usernameInputBox.clear();
        usernameInputBox.sendKeys("standard_user");

        WebElement passwordInputBox = webDriver.findElement(By.id("password"));
        passwordInputBox.clear();
        passwordInputBox.sendKeys("secret_sauce");

        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();
    }

    public WebDriver getDriver() {
        return webDriver;
    }

    public WebElement getUserNameInputBox() {
        return webDriver.findElement(By.id("user-name"));
    }

    public String getName() {
        return "Siva";
    }
}
