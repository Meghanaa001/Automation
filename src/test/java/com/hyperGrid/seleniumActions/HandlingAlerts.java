package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingAlerts extends HyperGridBase {

    @Test
    public void handlingAlerts() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsConfirmButton = driver.findElement(By.cssSelector("[onclick^='jsConfirm']"));
        jsConfirmButton.click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        jsConfirmButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


    }
}
