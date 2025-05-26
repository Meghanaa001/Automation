package com.hyperGrid.seleniumActions;

import com.hyperGrid.testng.HyperGridBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingTables extends HyperGridBase {

    //table[@id="table1"]/descendant::td[text()='Conway']/following-sibling::td

    //table[@id="table1"]/tbody/tr/td[text()='Doe']/following-sibling::td[4]

    //table[@id="table1"]/tbody/tr/td[1]
    //table[@id='table1']/thead/tr/th/span[text()='Email']/ancestor::table/tbody/tr/td[3]
    String name = "Bach";
    String column = "Web Site";

    @Test
    public void getSpecificRowData(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> rowData = driver.findElements(By.xpath(
                "//table[@id='table1']/descendant::td[text()='"+name+"']/following-sibling::td[not(a)]"
        ));
        String lastName = rowData.get(0).getText();
        List<String> userData = new ArrayList<>();

        for (int i=0; i< rowData.size(); i++){
            userData.add(rowData.get(i).getText());
        }
        List<String> expectedData = Arrays.asList("John", "jsmith@gmail.com"," $50.00", "http://www.jsmith.com");
        System.out.println(userData);
        Assert.assertEquals(userData, expectedData);
    }

    @Test
    public void getColumnSpecificData(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> columnElements = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        List<String> columnData = new ArrayList<>();
        for(int i=0; i< columnElements.size(); i++){
            columnData.add(columnElements.get(i).getText());
        }
        System.out.println(columnData);
        int index = columnData.indexOf(column) + 1;
        System.out.println(index);

        List<WebElement> specificColumnData = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='"+column+"']/ancestor::table/tbody/tr/td["+index+"]"));
        List<String> columnRecords = new ArrayList<>();

        for (int i=0; i< specificColumnData.size(); i++){
            columnRecords.add(specificColumnData.get(i).getText());
        }
        System.out.println(columnRecords);
    }

    @Test
    public void editSpecificData(){
        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement recordEditButton = driver.findElement(By.xpath("//table[@id='table1']/descendant::td[text()='"+name+"']/following-sibling::td/a[@href='#edit']"));

        recordEditButton.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("edit"));
    }

}
