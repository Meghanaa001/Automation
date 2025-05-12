package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DropdownHandling {
    WebDriver driver;

    @Test
    public void handleDropDown() {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[name=\"UserFirstName\"]")).sendKeys("John");
        driver.findElement(By.cssSelector("[name=\"UserLastName\"]")).sendKeys("Doe");
        driver.findElement(By.cssSelector("[name=\"UserTitle\"]")).sendKeys("QA Engineer");
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("select[id^='CompanyEmployees']"));
        Select employeesSelect = new Select(employeesDropDown);
        employeesSelect.selectByVisibleText("21 - 200 employees");
        employeesSelect.selectByValue("500");
       // employeesSelect.selectByContainsVisibleText("10,001");
        employeesSelect.selectByIndex(1);

        String selectedOptionText = employeesSelect.getFirstSelectedOption().getText();
        System.out.println(selectedOptionText);

        Assert.assertEquals(selectedOptionText, "1 - 20 employees");

        List<WebElement> allListItems = employeesSelect.getOptions();
        List<String> actualList = new ArrayList<>();

        WebElement firstOption = allListItems.get(0);

        String firstOptionText = allListItems.get(2).getText();
        System.out.println(firstOption.getText());

        WebElement secondOption = allListItems.get(1);
        System.out.println(secondOption.getText());

        for(int i=1; i<allListItems.size(); i++){
        actualList.add(allListItems.get(i).getText());
        }

        System.out.println("actualList :: " + actualList);
        List<String> expectedList = Arrays.asList("1 - 20 employees", "21 - 200 employees", "201 - 10,000 employees", "10,001+ employees");

        Assert.assertEquals(actualList, expectedList);
    }
}
