package com.hyperGrid.implementSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VerifyTextOnWebPage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement nextButton = driver.findElement(By.cssSelector("[data-page-cntrl='next']"));
        nextButton.click();

        WebElement firstNameInputBoxErrorMessage = driver.findElement(By.xpath("//label[starts-with(@for,'UserFirstName')]/following-sibling::span"));

        System.out.println(firstNameInputBoxErrorMessage.getText());
        String actualErrorMessage = firstNameInputBoxErrorMessage.getText();
        String expectedErrorMessage = "Enter your first name";
        //if (actualErrorMessage.equals("Enter your first name")){
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Test case Pass");
        } else {
            System.out.println("Test Fails");
        }

    }
}
