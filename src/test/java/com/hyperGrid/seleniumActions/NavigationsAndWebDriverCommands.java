package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigationsAndWebDriverCommands {

    WebDriver driver;

    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void navigateToURL(){
        driver.navigate().to("https://cogmento.com/en");

        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);

        driver.get("https://ui.cogmento.com/");

        String loginPageTitle = driver.getTitle();
        System.out.println(loginPageTitle);

        driver.navigate().back();
        Assert.assertEquals(homePageTitle, "Free CRM Software - Customer Relationship Management");

        driver.navigate().forward();
        Assert.assertEquals(loginPageTitle, "Cogmento CRM");

        driver.navigate().refresh();
        Assert.assertEquals(loginPageTitle, "Cogmento CRM");
    }

    @Test
    public void specificDriverValidations(){
        driver.navigate().to("https://cogmento.com/");
        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);
        Assert.assertEquals(homePageTitle, "Free CRM Software - Customer Relationship Management");

        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        Assert.assertTrue(pageSource.contains("Automotive CRM helps your dealership build trust with customers and connect and maintain those customer connections"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://cogmento.com/en-GB");

        System.out.println(driver.getWindowHandle());
    }
}
