package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorTests extends HyperGridBase {

    @Test
    public void jseClick(){
        driver.get("https://www.saucedemo.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement loginButton = driver.findElement(By.id("login-button"));
        WebElement usernameInputBox = driver.findElement(By.id("user-name"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));

        jse.executeScript("arguments[0].value='standard_user'", usernameInputBox);
        jse.executeScript("arguments[0].value='secret_sauce'", passwordInputBox);

        jse.executeScript("arguments[0].click()", loginButton);
    }

}
