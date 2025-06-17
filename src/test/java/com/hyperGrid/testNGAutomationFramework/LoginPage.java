package com.hyperGrid.testNGAutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;
    private CommonActions commonActions;

    public LoginPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
        this.driver = driver;
        commonActions = new CommonActions(driver);

    }

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    String data = "";
    private final By errorMessage = By.cssSelector("h3[data-test='error "+data+"']");
    @FindBy(id = "user-name")
    private WebElement userNameInputBox;
    @FindBy(css = "#password")
    private WebElement passwordInputBox;
    @FindBy(id="login-button")
    private WebElement signInButton;


    public void loginAsAdmin(String username, String password){
        /*userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();*/

        commonActions.typeValue(userNameInputBox, username);
        commonActions.typeValue(passwordInputBox, password);
        commonActions.clickOnWebElement(signInButton);
    }

    public void login(String username, String password) {
        /*driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();*/

        commonActions.typeValue(usernameField, username);
        commonActions.typeValue(passwordField, password);
        commonActions.clickOnWebElement(loginButton);

    }
}
