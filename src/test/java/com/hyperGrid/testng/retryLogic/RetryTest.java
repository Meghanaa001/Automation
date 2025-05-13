package com.hyperGrid.testng.retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test
    public void simpleTest(){
        System.out.println("Simple Test");
        Assert.assertEquals(1,1);
    }

    @Test
    public void simpleTest2(){
        System.out.println("Simple Test2");
        Assert.assertTrue(1>1);
    }

}
