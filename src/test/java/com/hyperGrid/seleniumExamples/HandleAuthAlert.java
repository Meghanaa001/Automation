package com.hyperGrid.seleniumExamples;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAuthAlert extends HyperGridBase {

    @Test
    public void handleAuthAlert(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        boolean b = driver.findElement(By.tagName("p")).getText().contains("Congratulations! You must have the proper credentials");
        System.out.println(b);
        Assert.assertTrue(b);
    }
}
