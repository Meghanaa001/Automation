package com.hyperGrid.javaBasics;

public class LocalAndGlobalVariables {

    int id= 10;
    public int testId = 123;
    String name = "Shiva";

    public static void main(String[] args) {
        LocalAndGlobalVariables localAndGlobalVariables;
        localAndGlobalVariables = new LocalAndGlobalVariables();
        System.out.println(localAndGlobalVariables.id);
        System.out.println(localAndGlobalVariables.name);

        localAndGlobalVariables.userDetails();
    }


    public void userDetails(){
        int userId = 20;
        System.out.println(id);
        System.out.println(name);
    }
}
