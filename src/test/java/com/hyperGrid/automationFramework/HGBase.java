package com.hyperGrid.automationFramework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class HGBase {

    WebDriver driver;

    /**
     * This method initializes the WebDriver based on the browser name provided in the test suite XML file.
     * It also maximizes the browser window and sets an implicit wait time.
     *
     * @param browserName The name of the browser to launch (e.g., "chrome", "firefox", "edge", "safari").
     */
    @Parameters("browserName")
    @BeforeSuite
    public void initializeDrivers(@Optional("chrome") String browserName) {
        launchBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    /**
     * This method launches the specified browser based on the browser name.
     * It supports Chrome, Firefox, Edge, and Safari browsers.
     *
     * @param browserName The name of the browser to launch.
     */
    public void launchBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }
    }

    @Parameters("appUrl")
    @BeforeTest
    public void launchApplication(@Optional("https://www.saucedemo.com/") String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void captureScreenshot(ITestResult iTestResult, Method mothod) {
        if (iTestResult.getStatus() == ITestResult.FAILURE){
            getScreenshot(mothod);
        }
    }

    public void getScreenshot(Method method) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("screenshots/" + method.getName() + ".png");
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method close the entire webdriver session.
     */
    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}
