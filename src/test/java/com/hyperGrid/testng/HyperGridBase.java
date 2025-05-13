package com.hyperGrid.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperGridBase {

    protected WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver = new ChromeDriver();
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
