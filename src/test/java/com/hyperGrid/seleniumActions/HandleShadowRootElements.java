package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleShadowRootElements extends HyperGridBase {

    @Test
    public void clickOnShadowRootElement(){
        driver.get("https://www.salesforce.com/in/?ir=1");

        SearchContext rootElement = driver.findElement(By.cssSelector("hgf-c360nav[origin*='sfdcdigital']")).getShadowRoot();
        rootElement.findElement(By.cssSelector("[data-tracking-type='cta-utility']")).click();

        /*try{
            tryForFreeElement.click();
        }catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", tryForFreeElement);
        }*/
    }

    @Test
    public void typeValue(){
        driver.get("https://books-pwakit.appspot.com/");

        SearchContext rootElement = driver.findElement(By.cssSelector("[apptitle=\"BOOKS\"]")).getShadowRoot();
        rootElement.findElement(By.cssSelector("#input")).sendKeys("Selenium");
    }
}
