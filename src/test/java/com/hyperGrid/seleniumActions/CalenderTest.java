package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CalenderTest extends HyperGridBase {

    String year = "2026";
    String month = "March";
    String date = "1";
    @Test
    public void selectDate(){
        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.cssSelector("[data-cy='closeModal']")).click();
        driver.findElement(By.cssSelector("[data-cy='departureDate']")).click();
        //List<WebElement> yearElement = driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'"+year+"')]"));

        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label=\"Next Month\"]"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true){
            if (driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'"+year+"')]")).size()>0){
                break;
            } else {
                nextButton.click();
            }
        }

        while (true){
            if (driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'"+month+"')]")).size()>0){
                break;
            } else {
                nextButton.click();
            }
        }

        driver.findElement(
                By.xpath(
                        "//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../../descendant::div[starts-with(@class,'DayPicker-Day')]/div/p[not(@class)][text()='"+date+"']")).click();

        System.out.println();

    }

}
