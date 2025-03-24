package com.hyperGrid.oops.polymorphism;

public class PolyTest {

    public static void main(String[] args) {
        PolyTest polyTest = new PolyTest();
        polyTest.sum(10, 20);
        polyTest.sum(10, 10, 10);

        polyTest.userDetails("App", 600, 7574385);
    }

    public void sum(int a, int b) {

    }

/*
    public int sum(int a, int b) {
        return a + b;
    }
*/

    public void sum(int a, double b) {

    }

    public void sum(int a, int b, int c) {

    }

    public void userDetails(String name, int id) {

    }

    public void userDetails(String name, int id, int phone) {

    }

    public void register(String firstname, String lastName, String email, String password) {

    }

    public void register(String firstname, String lastName, String email, String password, String address, String pinCode, String country) {

    }

    public void getMessage(String text) {

    }

    public void getMessage(char text) {

    }
}
