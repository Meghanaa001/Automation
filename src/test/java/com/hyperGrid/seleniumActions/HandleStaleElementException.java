package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleStaleElementException extends HyperGridBase {

    @Test
    public void handleStale(){
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Siva");

        driver.navigate().refresh();

        try{
            usernameInput.sendKeys("Selenium");
        }catch (StaleElementReferenceException ste){
            driver.findElement(By.name("username")).sendKeys("Selenium");
        }
    }
}
