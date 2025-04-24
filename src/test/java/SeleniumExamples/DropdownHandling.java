package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropdownHandling {
    WebDriver driver;

    @Test
    public void handleDropDown() {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("select[id^='CompanyEmployees']"));
        Select employeesSelect = new Select(employeesDropDown);
        employeesSelect.selectByVisibleText("21 - 200 employees");
        employeesSelect.selectByValue("500");
        employeesSelect.selectByContainsVisibleText("10,001");
        employeesSelect.selectByIndex(1);

        String selectedOptionText = employeesSelect.getFirstSelectedOption().getText();
        System.out.println(selectedOptionText);

        Assert.assertEquals(selectedOptionText, "1 - 20 employees");
    }
}
