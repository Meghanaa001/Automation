package com.hyperGrid.implementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SalesForceTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        firstNameInputBox.sendKeys("RPA");

        WebElement lastNameInputBox = driver.findElement(By.name("UserLastName"));
        lastNameInputBox.sendKeys("Selenium");

        WebElement jobTitle = driver.findElement(By.name("UserTitle"));
        jobTitle.sendKeys("Director");


        driver.quit();
    }
}
