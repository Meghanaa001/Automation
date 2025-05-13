package com.hyperGrid.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    @DataProvider(name = "usersSet1")
    public Object[][] getCredentials(){

        return new Object[][] {

                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }

    @DataProvider(name = "usersSet2")
    public Object[][] getCredentialSet2(){

        return new Object[][] {

                {"problem_user","secret_sauce"},
                {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }


    @Test(dataProvider = "usersSet1")
    public void login(String username, String password){
        System.out.println(username + " :: " + password);
    }
}
