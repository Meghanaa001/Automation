package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ColorValidation extends HyperGridBase {

    @Test
    public void verifyColourOfTheElement(){
        WebElement loginButton = driver.findElement(By.cssSelector("[data-test='login-button']"));

        String color = loginButton.getCssValue("background-color");
        System.out.println(color);

        String hexaCode = Color.fromString(color).asHex();
        System.out.println(hexaCode);

        Assert.assertEquals(hexaCode, "#3ddc91");
    }
}
