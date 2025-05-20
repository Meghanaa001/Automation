package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class HandlingScreenshots extends HyperGridBase {

    @Test
    public void getScreenshot() throws IOException {
        driver.get("https://www.salesforce.com/in/?ir=1");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+"/screenshots/page.png");
        FileHandler.copy(sourceFile, destinationFile);
    }

    @Test
    public void takeScreenshotSpecificToElement() throws IOException {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement footerImage = driver.findElement(By.cssSelector("#page-footer"));
        File sourceFile = footerImage.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+"/screenshots/element.png");
        FileHandler.copy(sourceFile, destinationFile);

    }
}
