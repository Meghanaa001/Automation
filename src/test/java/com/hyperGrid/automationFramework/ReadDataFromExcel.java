package com.hyperGrid.automationFramework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadDataFromExcel {

  // @Test(dataProvider = "userCredentials")
    public void login(String userType, String userName, String password){
        System.out.println(userType + " :: " + userName + " :: " + password);
    }


    @DataProvider(name = "userCredentials")
    public Object[][] readEntireDataFromExcel() throws IOException {
        File file = new File(System.getProperty("user.dir")+"/src/main/resources/UsersData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Credentials");
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        int numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(numberOfRows);
        System.out.println(numberOfColumns);

        String[][] dataValues = new String[numberOfRows][numberOfColumns];
        for (int i=0; i<numberOfRows; i++){
            for (int j=0; j<numberOfColumns; j++){
                Cell cell = sheet.getRow(i).getCell(j);
                dataValues[i][j] = cell.getStringCellValue();
            }
        }

        for (String[] data: dataValues){
            System.out.println(Arrays.toString(data));
        }
        return dataValues;
    }
}
