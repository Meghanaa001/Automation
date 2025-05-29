package com.hyperGrid.seleniumExamples;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

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

    @Test
    public void calenderSample() throws InterruptedException, AWTException {
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement calenderStartDate = driver.findElement(By.cssSelector("#start-date"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",calenderStartDate);

        calenderStartDate.click();

        Robot robot = new Robot();

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);




//        jse.executeScript("arguments[0].click()", calenderStartDate);

//        Actions actions = new Actions(driver);
//        actions.moveToElement(calenderStartDate).click().perform();

//        Dimension dimension = calenderStartDate.getSize();
//        System.out.println(dimension);
//        int x = (int) (dimension.getWidth() * 0.95);
//        int y = dimension.getHeight()/2;
//        actions.moveToElement(calenderStartDate).click().perform();

        System.out.println();
    }

}
