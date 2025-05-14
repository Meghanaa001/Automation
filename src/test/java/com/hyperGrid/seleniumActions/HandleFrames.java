package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleFrames extends HyperGridBase {

    @Test
    public void handleFrames(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");


        WebElement topFrame = driver.findElement(By.cssSelector("[src$='frame_top']"));
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame("frame-left");
        WebElement leftBox = driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
        Assert.assertTrue(leftBox.isDisplayed());


        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");

        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='MIDDLE']")).isDisplayed());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

        Assert.assertTrue(driver.findElements(By.xpath("//body[normalize-space()='BOTTOM']")).size() == 1);
    }
}
