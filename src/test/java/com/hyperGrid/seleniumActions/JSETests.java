package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSETests extends HyperGridBase {

    @Test
    public void jsClick(){
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");

        //JavascriptExecutor jse = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));

        String clickScript = "arguments[0].click()";
        String typeScript = "arguments[0].value='Siva'";

        jse.executeScript(typeScript, firstNameInputBox);
        jse.executeScript("arguments[0].setAttribute('style','background-color:#FF0000')", nextButton);
        jse.executeScript(clickScript, nextButton);
    }

    @Test
    public void handleClickInterceptedException(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=57");
        String brand = "Pre-Order";
        WebElement checkBox = driver.findElement(By.xpath("(//label[text()='"+brand+"'])[2]/preceding-sibling::input"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        try{
            jse.executeScript("arguments[0].scrollIntoView(true)", checkBox);
            jse.executeScript("window.scrollBy(0, 100)");

            checkBox.click();
        }catch (StaleElementReferenceException ste){

        }catch (ElementNotInteractableException ene){
            jse.executeScript("arguments[0].click()", checkBox);
        }
    }
}
