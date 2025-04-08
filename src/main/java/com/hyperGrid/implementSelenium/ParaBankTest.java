package com.hyperGrid.implementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBankTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");

        WebElement userNameInputBox = driver.findElement(By.name("username"));
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.className("button"));


        userNameInputBox.sendKeys("SeleniumAutomation");
        passwordInputBox.sendKeys("Test@123");
        loginButton.click();

        driver.quit();

    }
}
