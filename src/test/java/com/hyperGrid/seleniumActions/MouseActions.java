package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MouseActions extends HyperGridBase {

    @Test
    public void handleDynamicDropDown(){
        driver.get("https://www.next.co.uk/?utm_campaign=redirect&utm_medium=shorturl&utm_source=next.co");

        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        WebElement menMenu = driver.findElement(By.xpath("//div[text()='men']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menMenu).perform();
        WebElement allClothingLink = driver.findElement(By.xpath("//span[text()='All Clothing']"));
        actions.moveToElement(allClothingLink).click().perform();

        WebElement footerLink = driver.findElement(By.xpath("(//a[text()='Furniture Spare Parts'])[1]"));
        actions.scrollToElement(footerLink).perform();

        actions.moveToElement(driver.findElement(By.cssSelector("[src=\"/Images/Next/newsletter-icon.svg\"]"))).perform();

    }

    @Test
    public void handleDragAndDrop(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement aBox = driver.findElement(By.id("column-a"));
        WebElement bBox = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(aBox, bBox).perform();
    }

    @Test
    public void handleDragAndDropMethod2(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement aBox = driver.findElement(By.id("column-a"));
        WebElement bBox = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.click(aBox).clickAndHold(aBox);
        actions.pause(Duration.ofSeconds(2));
        actions.moveToElement(bBox).perform();
    }



}
