package com.hyperGrid.implementSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WritingDynamicXpaths {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=57");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String brand = "Pre-Order";
        WebElement checkBox = driver.findElement(By.xpath("(//label[text()='"+brand+"'])[2]/preceding-sibling::input"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            checkBox.click();
        }catch (ElementClickInterceptedException ec){
            jse.executeScript("arguments[0].click()", checkBox);
        }
    }
}
