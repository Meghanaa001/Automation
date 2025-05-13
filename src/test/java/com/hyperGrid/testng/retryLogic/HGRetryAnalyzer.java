package com.hyperGrid.testng.retryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class HGRetryAnalyzer implements IRetryAnalyzer {
    int retryCount = 0;
    int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount < maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
