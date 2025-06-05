package com.hyperGrid.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WritingCustomActions1 {

    WebDriver webDriver;

    public void selectDropDownValue(WebElement element, String methodType, String value) {
        Select select = new Select(element);
        switch (methodType) {
            case "selectByValue":
                select.selectByValue(value);
                break;
            case "selectByVisibleText":
                select.selectByVisibleText(value);
                break;
            case "selectByIndex":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "selectByContainsText":
                select.selectByContainsVisibleText(value);
                break;
            default:
                System.out.printf("Invalid method type: %s%n", methodType);
        }
    }

    public WebElement getWebElement(By by) {
        return webDriver.findElement(by);
    }

    public void typeValue(By locator, String data) {
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(data);
    }

    public void typeValue(WebElement element, String data) {
        element.clear();
        element.sendKeys(data);
    }

    public void clickOnWebElement(WebElement element) {
        element.click();
    }

    public void clickOnWebElement(By by) {
        webDriver.findElement(by).click();
    }

    @AfterClass
    public void killSession() {
        webDriver.quit();
    }

    @BeforeClass
    public void initialize() {
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void login() {
        getWebElement(By.id("user-name")).sendKeys("standard_user");

        typeValue(By.id("password"), "standard_user");
        clickOnWebElement(webDriver.findElement(By.id("login-button")));

        String productsPageHeading = getWebElement(By.cssSelector(".title")).getText();
        Assert.assertEquals(productsPageHeading, "Products", "Both values are not same");

        WebElement productsDropDown = getWebElement(By.cssSelector("select.product_sort_container"));
        selectDropDownValue(productsDropDown, "SelectByVisibleText", "Products");
    }

}
