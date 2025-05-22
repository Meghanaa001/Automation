package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleShadowRootElements extends HyperGridBase {

    @Test
    public void clickOnShadowRootElement(){
        driver.get("https://www.salesforce.com/in/?ir=1");

        SearchContext rootElement = driver.findElement(By.cssSelector("hgf-c360nav[origin*='sfdcdigital']")).getShadowRoot();
        SearchContext rootElement1 = rootElement.findElement(By.cssSelector("[data-tracking-type=\"cta-utility\"]")).getShadowRoot();
        WebElement button = rootElement1.findElement(By.cssSelector(".hgf-button"));

        try{
            rootElement1.findElement(By.cssSelector("[data-tracking-type='cta-utility']")).click();
        }catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", button);
        }
    }

    @Test
    public void typeValue(){
        driver.get("https://books-pwakit.appspot.com/");

        SearchContext rootElement = driver.findElement(By.cssSelector("[apptitle=\"BOOKS\"]")).getShadowRoot();
        rootElement.findElement(By.cssSelector("#input")).sendKeys("Selenium");
    }

    @Test
    public void salesForceTest(){
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement mainRootElement = driver.findElement(By.cssSelector("hgf-c360nav[origin*='sfdcdigital']"));

        SearchContext mainShadowElement = mainRootElement.getShadowRoot();
        System.out.println("mainShadowElement :: " + mainShadowElement.toString());

        mainShadowElement.findElement(By.cssSelector("[data-tracking-type='cta-utility']")).click();
    }
}
