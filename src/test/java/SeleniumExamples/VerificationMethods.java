package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerificationMethods {
    /**
     * isDisplayed()
     * isEnabled()
     * isSelected()
     */

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void isElementDisplayed(){
        driver.get("https://www.saucedemo.com/");
        WebElement heading = driver.findElement(By.cssSelector(".login_log"));
        System.out.println(heading.isDisplayed());
    }

    @Test
    public void isElementEnabled(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement xsSizeButton = driver.findElement(By.xpath("//span[text()='XS']"));
        WebElement lSizeButton = driver.findElement(By.xpath("//span[text()='L']"));

        System.out.println(xsSizeButton.isEnabled());
        System.out.println(lSizeButton.isEnabled());
    }

    @Test
    public void isElementEnabled2(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/product&path=57&product_id=34");

        WebElement availableDaysButton = driver.findElement(By.xpath("(//button[@title=\"Add to Cart\"])[2]"));
        System.out.println(availableDaysButton.isEnabled());

    }


    @Test
    public void isElementSelected(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("(//form/input)[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//form/input)[2]"));

        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());

        checkBox1.click();
        checkBox2.click();

        System.out.println("************************");
        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());
    }

    @Test
    public void isElementSelected2(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25");

        WebElement printerCheckBox = driver.findElement(By.xpath("//label[contains(text(),'Printers')]/preceding-sibling::input"));

        System.out.println(printerCheckBox.isSelected());

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].click()", printerCheckBox);

        //printerCheckBox.click();
        System.out.println(printerCheckBox.isSelected());
    }
}
