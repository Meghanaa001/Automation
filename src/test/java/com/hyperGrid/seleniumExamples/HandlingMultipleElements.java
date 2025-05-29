package com.hyperGrid.seleniumExamples;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingMultipleElements extends HyperGridBase {

    @Test
    public void verifyMultipleElements(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.cssSelector("[onclick^='addElement']"));
        int n = 5;

        for(int i=0; i<n; i++){
            addButton.click();
        }

        WebElement addButton1 = driver.findElement(By.cssSelector("[onclick^='addElement']"));
        System.out.println(addButton1);
        List<WebElement> deleteElements = driver.findElements(By.cssSelector("[onclick^='deleteElement']"));
        System.out.println(deleteElements);
        System.out.println(deleteElements.size());
        Assert.assertEquals(deleteElements.size() , 5);
        Assert.assertTrue(deleteElements.size() == 5);

        WebElement deleteButton = driver.findElement(By.cssSelector("[onclick^='deleteElement']"));

        for (int j=0; j<n; j++){
            deleteButton.click();
        }

        Assert.assertTrue(driver.findElements(By.cssSelector("[onclick^='deleteElement']")).size() == 0);

    }

}
