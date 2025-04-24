package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyTextAndAttribute {

    WebDriver driver;
    @Test
    public void verifyTextMessage(){

        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement freeTrailHeading1 = driver.findElement(By.cssSelector("#start-your-free-sales-trial>span"));
        System.out.println(freeTrailHeading1.getText());
        String actualHeading = freeTrailHeading1.getText();

        WebElement freeTrailHeading2 = driver.findElement(By.xpath("//span[normalize-space(text())='Start your free sales trial.']"));
        System.out.println(freeTrailHeading2.isDisplayed());
        boolean isHeadingDisplayed = freeTrailHeading2.isDisplayed();

        Assert.assertEquals(actualHeading, "Start your free sales trial.");
        Assert.assertTrue(isHeadingDisplayed);

    }
}
