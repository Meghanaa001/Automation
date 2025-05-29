package com.hyperGrid.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;
    long startTime;
    long endTime;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }

    @AfterClass
    public void killSession() {
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        driver.quit();
    }

    @Test
    public void aboutImplicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userNameInputBox = driver.findElement(By.id("user-nam"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
    }

    @Test
    public void aboutWebDriverWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("Test");
        boolean isTitlePresent = webDriverWait.until(ExpectedConditions.titleIs("Swag Labs"));
        Assert.assertTrue(isTitlePresent);
        //WebElement userNameInputBox = driver.findElement(By.id("user-name"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
    }

    @Test
    public void aboutFluentWait(){
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withMessage("Please provide right locator");
        fluentWait.pollingEvery(Duration.ofSeconds(5));
        fluentWait.withTimeout(Duration.ofSeconds(15));
        fluentWait.ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-nam")));
    }
}
