package com.hyperGrid.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class HyperGridBase {

    protected WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Parameters("url")
    @BeforeTest
    public void launchApplication(@Optional("https://www.saucedemo.com/") String appUrl){
        driver.get(appUrl);
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }
}
